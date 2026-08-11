package com.pixiu.fortune8keno.fortune8keno.config.rtp;


import com.pixiu.fortune8keno.fortune8keno.play.spin.KenoPayout;

import java.util.Map;


public class GameMathSeparateImp_96 extends GameMathConfigSeparate {
    @Override
    public String createTheoreticalRtp() {
        return "96.0";
    }

    @Override
    protected Map<Integer, KenoPayout> createKenoPayouts() {
        return null;
    }


}
