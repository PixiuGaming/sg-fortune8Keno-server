package com.pixiu.fortune8keno.fortune8keno.play.basegame;


import lombok.Data;

@Data
public class BonusGameStatus {

    private boolean isNormalFreeSpinsTriggered;
    private boolean isFSRetriggered;
    private boolean isWheelBonusTriggered;
    private int initialNumFreeSpinsCount;
}
