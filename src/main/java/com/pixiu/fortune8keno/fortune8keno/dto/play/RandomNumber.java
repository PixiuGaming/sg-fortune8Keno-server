package com.pixiu.fortune8keno.fortune8keno.dto.play;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RandomNumber {

  private int bits;
  private int range;
  private int value;
}
