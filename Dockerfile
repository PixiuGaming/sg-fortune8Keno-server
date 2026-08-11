# ---- Stage 1: Build ----
# Has Maven + JDK, compiles the jar. Not part of the final image.
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy just the pom first so Docker can cache the dependency download layer
# separately from your source code — dependencies only get re-downloaded
# when pom.xml actually changes, not on every source edit.
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Now copy the actual source and build the jar.
COPY src ./src
RUN mvn clean package -DskipTests -B

# ---- Stage 2: Runtime ----
# Small image, JRE only — no Maven, no source code, no build tooling.
# This is the image that actually ships/runs.
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy only the built jar out of the build stage.
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]