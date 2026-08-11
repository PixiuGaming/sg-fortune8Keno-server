package com.pixiu.fortune8keno.fortune8keno.spin;


import com.pixiu.fortune8keno.fortune8keno.play.basegame.BonusGameStatus;
import com.pixiu.fortune8keno.fortune8keno.results.SpinResult;
import lombok.Data;

import java.util.List;

@Data
public class SpinGameResult {

    private List<SpinResult> spinResults;
    private BonusGameStatus baseGameStatus;
}
