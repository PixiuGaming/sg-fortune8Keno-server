package com.pixiu.fortune8keno.fortune8keno.results;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class SlotDataResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal betAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer featureIdx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer multiplierPrize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer reelSetIdx;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Integer> reelsPos;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean rewind;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<int[]> slotFace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<int[]> slotFaceBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal winAmount = BigDecimal.ZERO;



    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int[] wildPositions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean capped;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int randomSym = 0;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private  List<int[]> superBonusSlotFace;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int symbolsToRemoveForRewind;






}
