package rtp;

import com.pixiu.fortune8keno.fortune8keno.config.GameConfiguration;
import com.pixiu.fortune8keno.fortune8keno.play.spin.SpinGame;
import com.pixiu.fortune8keno.fortune8keno.results.SpinResult;

import java.math.BigDecimal;

public class SingleRTP {
    static BigDecimal stake = BigDecimal.valueOf(1); // Assuming a fixed stake of 1 unit per round
    public static void main(String[] args) throws Exception {

        playGame();

    }

    private static double playGame() throws Exception {


        SpinGame spinGame ;

        double totalWin = 0;


        int rounds = 1000_0000; // Number of rounds to simulate

        int countWin = 0;



            RtpRunner rtpRunner = RtpRunner.builder()

                    .rngContainerAddress("http://localhost:50000")
                    .stake(stake)

                    .totalRuns(rounds)
                    .build();

            rtpRunner.call();

        int totalStake = stake.intValue() * rounds;
        double rtp = (double) totalWin / totalStake * 100;
        System.out.println("Hit rate: " + ((double) countWin / rounds * 100) + "%");
        System.out.println("Total Stake: " + totalStake);
        System.out.println("Total Win: " + totalWin);
        System.out.println("RTP: " + rtp + "% ");




        return totalWin;
    }
}
