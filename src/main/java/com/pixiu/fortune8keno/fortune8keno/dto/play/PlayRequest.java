package com.pixiu.fortune8keno.fortune8keno.dto.play;


import com.pixiu.fortune8keno.fortune8keno.dto.PlayerState;
import com.pixiu.fortune8keno.fortune8keno.play.Command;
import com.pixiu.fortune8keno.fortune8keno.results.StateResult;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class PlayRequest {

  private Context context;
  private String currency;
  private BigDecimal stakeAmount;
  private StateResult state;


  private PlayRequestCommandData command;
  private String cheat;


}
