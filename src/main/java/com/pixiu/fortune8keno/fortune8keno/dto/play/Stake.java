package com.pixiu.fortune8keno.fortune8keno.dto.play;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class Stake {
  private BigDecimal coinBet;
  private BigDecimal cashBet;
  private String currency;

}
