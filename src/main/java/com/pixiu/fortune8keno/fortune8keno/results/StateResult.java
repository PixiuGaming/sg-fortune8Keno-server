package com.pixiu.fortune8keno.fortune8keno.results;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pixiu.fortune8keno.fortune8keno.dto.play.GameStateDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StateResult {

    private String rigging;


    private String freeGame;


    private BigDecimal stake;


    private List<Integer> tierNumbers;


    private BigDecimal pendingCashWin;


    private GameStateDTO gameState;


}
