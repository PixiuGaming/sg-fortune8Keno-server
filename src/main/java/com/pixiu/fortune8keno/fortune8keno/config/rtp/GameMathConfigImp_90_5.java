package com.pixiu.fortune8keno.fortune8keno.config.rtp;


import com.pixiu.fortune8keno.fortune8keno.play.spin.KenoPayout;

import java.util.Map;


public class GameMathConfigImp_90_5 extends GameMathConfigSeparate {
    @Override
    public String createTheoreticalRtp() {
        return "90.5";
    }

    @Override
    protected Map<Integer, KenoPayout> createKenoPayouts() {
        return null;
    }


}
