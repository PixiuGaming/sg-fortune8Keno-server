package com.pixiu.fortune8keno.fortune8keno.play;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class FreeSpinState {

    public static final FreeSpinState EMPTY = new FreeSpinState();
    private BigDecimal baseGameWins = BigDecimal.ZERO;
    private int freeSpinsCount;
}
