package com.pixiu.fortune8keno.fortune8keno.dto.play;

import com.pixiu.fortune8keno.fortune8keno.dto.PlayerState;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
@Data
@Accessors(chain = true)
public class CollectRequest {

    private Context context;
    private String currency;
    private BigDecimal stakeAmount;
    //  private String state;
    private PlayerState state;

    private PlayRequestCommandData command;
    private String cheat;
}
