package rtp;

import com.pixiu.fortune8keno.fortune8keno.dto.play.PlayRequestCommandData;
import com.pixiu.fortune8keno.fortune8keno.service.GamePlayService;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;


@Builder
@Slf4j
@Data
@Accessors(chain = true)
public class RtpRunner implements Callable<RtpResult> {

    @Builder.Default
    private final int maxRunsToReportSTD = 1_000_000_0;
    private BigDecimal expectedRTP;

    private GamePlayService gamePlayService;

    @Builder.Default
    private boolean saveResults = false;

    @Builder.Default
    List<RoundResult> roundResults = new ArrayList<>();

    private String rngContainerAddress;

    @Builder.Default
    private PlayRequestCommandData initialCommand = new PlayRequestCommandData(); //default to basic spin

    @Builder.Default
    private BigDecimal stake = new BigDecimal(1);


    private int totalRuns;





    public RtpResult call() throws Exception {


        if (gamePlayService == null) gamePlayService = RtpSetUp.createGamePlayService();
        initialCommand.setAction("START");
        initialCommand.setStakeAmount(stake);

        BigDecimal totalWins = BigDecimal.ZERO;


            RoundResult roundResult = new RtpTask().setStakeValue(stake)
                    .setGamePlayService(gamePlayService)
                    .setExpectedRTP(expectedRTP)
                    .setSaveResults(saveResults)
                    .setInitialCommand(initialCommand)
                    .call();

            totalWins = totalWins
                    .add(BigDecimal.valueOf(roundResult.getWinAmount()));


            return new RtpResult()
                    .setWinAmount(totalWins);

        }
    }


