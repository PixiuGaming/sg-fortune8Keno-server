package com.pixiu.fortune8keno.fortune8keno.dto.play;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Context {
    private String sessionId;
    private String roundId;
    private String transactionId;
}
