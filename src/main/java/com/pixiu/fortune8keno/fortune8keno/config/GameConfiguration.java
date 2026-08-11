package com.pixiu.fortune8keno.fortune8keno.config;


import com.pixiu.fortune8keno.fortune8keno.config.rtp.GameMathConfigCommon;
import com.pixiu.fortune8keno.fortune8keno.config.rtp.GameMathConfigSeparate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class GameConfiguration {


    private String engineVersion;
    private String gameVersion;
    private String gdkVersion = "0.0.9";

    private BigDecimal maxWin = BigDecimal.valueOf(250000);
    private String rtpString;

    GameMathConfigCommon gameMathConfigCommon;
    GameMathConfigSeparate gameMathConfigSeparate;

    public GameConfiguration(GameMathConfigCommon gameMathConfigCommon, GameMathConfigSeparate gameMathConfigSeparate) {

        this.gameMathConfigCommon = gameMathConfigCommon;
        this.gameMathConfigSeparate = gameMathConfigSeparate;
    }
}
