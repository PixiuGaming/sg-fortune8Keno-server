package com.pixiu.fortune8keno.fortune8keno.config;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameConfigurationForClient {

    public GameConfigurationForClient(GameConfiguration gameConfiguration) {

        engineVersion = gameConfiguration.getEngineVersion();
        gameVersion = gameConfiguration.getGameVersion();
        maxWin = gameConfiguration.getMaxWin();
        rtpString = gameConfiguration.getRtpString();
    }

    private String rtpString;



    //pom.xml version
    private String engineVersion;
    private String gdkVersion = "0.0.16";
    private BigDecimal maxWin;

    //application.properties version
    private String gameVersion;
}
