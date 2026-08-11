package com.pixiu.fortune8keno.fortune8keno.play;



import com.pixiu.fortune8keno.fortune8keno.config.GameConfiguration;
import com.pixiu.fortune8keno.fortune8keno.dto.play.GameStateDTO;
import com.pixiu.fortune8keno.fortune8keno.dto.play.PlayRequestCommandData;
import com.pixiu.fortune8keno.fortune8keno.dto.play.Stake;

import com.pixiu.fortune8keno.fortune8keno.results.StateResult;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Data
@Builder
public class PlayRequestParameters {
    private final GameConfiguration gameConfiguration;

    private final BigDecimal stake;
    private final Set<Integer> selectedNumbers;

    private final boolean freeSpinsActive;
    private final boolean buyBonusCommand;

    private FreeSpinState freeSpinState;
    private final PlayRequestCommandData command;
    private final String action;
    private final StateResult state;

    public void setFreeSpinState(FreeSpinState freeSpinState){
        this.freeSpinState = freeSpinState;
    }

    public boolean isNormalFreeSpinsBuyBonus(){
        return command.equals(Command.BUY_FREESPINS);
    }

    public boolean isSuperFreeSpinsBuyBonus(){
        return command.equals(Command.BUY_SUPER_FREE_SPINS);
    }



}
