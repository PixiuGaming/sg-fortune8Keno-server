package com.pixiu.fortune8keno.fortune8keno.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "keno")
public class GameEngineProperties {

    /** Base URL of the platform, e.g. https://server.domain.com - RNG calls go to {base-url}/irgs/rng */
    private String rngBaseUrl = "http://localhost:8080";

    /** Total ball pool, e.g. 80 for classic 80-ball Keno. */
    private int poolSize = 80;

    /** How many balls are drawn per round. */
    private int drawCount = 20;

    /** Max numbers a player may pick per round. */
    private int maxPicks = 10;

    public String getRngBaseUrl() {
        return rngBaseUrl;
    }

    public void setRngBaseUrl(String rngBaseUrl) {
        this.rngBaseUrl = rngBaseUrl;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public int getMaxPicks() {
        return maxPicks;
    }

    public void setMaxPicks(int maxPicks) {
        this.maxPicks = maxPicks;
    }
}
