package com.pixiu.fortune8keno.fortune8keno.dto.play;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.pixiu.fortune8keno.fortune8keno.results.SpinResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Result {

  private int coinWin;
  private BigDecimal cashWin;
  private SpinResult clientData;
  @JsonInclude(Include.NON_EMPTY)
  private List<String> jackpotData;
}
