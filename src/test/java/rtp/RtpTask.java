package rtp;

import com.pixiu.fortune8keno.fortune8keno.dto.PlayerState;
import com.pixiu.fortune8keno.fortune8keno.dto.play.PlayRequest;
import com.pixiu.fortune8keno.fortune8keno.dto.play.PlayRequestCommandData;
import com.pixiu.fortune8keno.fortune8keno.service.GamePlayService;
import com.pixiu.fortune8keno.fortune8keno.results.SpinResult;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;



@Data
@Accessors(chain = true)
@Slf4j
public class RtpTask implements Callable<RoundResult> {
    private GamePlayService gamePlayService;


    private BigDecimal stakeValue;

    private BigDecimal expectedRTP;

    private PlayerState playerState;
    private List<Integer> randomNumbers = new ArrayList<>();
    private boolean saveResults = false;
    private PlayRequestCommandData initialCommand;

    @Override
    public RoundResult call() {

        PlayRequest playRequest = getBaseRequest();
        SpinResult baseGamePlayResponse;

            baseGamePlayResponse = gamePlayService.play(playRequest, expectedRTP);

        baseGamePlayResponse.getPrizeAmount();

            RoundResult result = new RoundResult();
            result.setWinAmount(baseGamePlayResponse.getPrizeAmount());
            result.setMultiplier(baseGamePlayResponse.getResult().getMultiplier());
            return result;

    }

    private PlayRequest getBaseRequest() {
        return new PlayRequest()
                .setStakeAmount(stakeValue)
//                .setState(playerState)
                .setCommand(initialCommand);
    }


}
