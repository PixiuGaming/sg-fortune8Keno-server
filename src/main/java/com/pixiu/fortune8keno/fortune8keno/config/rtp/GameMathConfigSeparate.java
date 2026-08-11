package com.pixiu.fortune8keno.fortune8keno.config.rtp;

import com.pixiu.fortune8keno.fortune8keno.play.spin.KenoPayout;
import lombok.Getter;

import java.util.Map;

@Getter
public abstract class GameMathConfigSeparate {

    private Map<Integer, KenoPayout> kenoPayouts = createKenoPayouts();
    private final String theoreticalRtp = createTheoreticalRtp();

    protected abstract String createTheoreticalRtp() ;


    protected abstract Map<Integer, KenoPayout> createKenoPayouts() ;


}
