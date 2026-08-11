package com.pixiu.fortune8keno.fortune8keno.spin;

import com.pixiu.fortune8keno.fortune8keno.dto.PlayerState;
import com.pixiu.fortune8keno.fortune8keno.dto.play.PlayResponse;
import com.pixiu.fortune8keno.fortune8keno.dto.play.Result;
import com.pixiu.fortune8keno.fortune8keno.dto.play.Stake;
import com.pixiu.fortune8keno.fortune8keno.play.FreeSpinState;
import com.pixiu.fortune8keno.fortune8keno.play.PlayRequestParameters;
import com.pixiu.fortune8keno.fortune8keno.play.basegame.BonusGameStatus;
import com.pixiu.fortune8keno.fortune8keno.results.SpinResult;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Collections;
import java.util.List;

import static com.pixiu.fortune8keno.fortune8keno.play.Command.FREESPINS;
import static com.pixiu.fortune8keno.fortune8keno.play.Command.WHEEL;


@Component
public class SpinGameResponseMapper {


    public SpinResult getPlayResponse(PlayRequestParameters playRequestParameters, SpinGameResult spinGameResult
                                        ) {



        SpinResult spinResult = spinGameResult.getSpinResults().get(0);






        return spinResult;
    }

    private List<Result> mapToResults(BigDecimal stake, List<SpinResult> basicSpinResult) {
        return basicSpinResult.stream()
                .map(spinResult -> {
                    Result result = new Result();
                    BigDecimal win = getCashWin(spinResult);
                    result.setCashWin(win);
                    //result.setCoinWin(win.divide(stake.getCoinBet(), MathContext.DECIMAL128).intValue());
                    result.setClientData(spinResult);
                    return result;
                })
                .toList();
    }

    private BigDecimal getCashWin(SpinResult spinResult) {
        BigDecimal totalWin = BigDecimal.ZERO;



        return totalWin;
    }

    private List<String> getNextCommands(boolean isBonusGameTriggered, boolean isWheelBonusTriggered, boolean fsRetriggered) {
        if(isWheelBonusTriggered){
            return isWheelBonusTriggered ? List.of(WHEEL) : Collections.emptyList();
        }
        if(fsRetriggered){
            return fsRetriggered ? List.of(FREESPINS) : Collections.emptyList();
        }
        return isBonusGameTriggered ? List.of(FREESPINS) : Collections.emptyList();
    }


}