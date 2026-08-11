package com.pixiu.fortune8keno.fortune8keno.play;


import com.pixiu.fortune8keno.fortune8keno.play.basegame.BaseCommand;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class Command {

    public static final String BASE = "start";
    public static final String COLLECT = "collect";
    public static final String EMPTY = "";
    public static final String FREESPINS = "FREESPINS";
    public static final String BUY_FREESPINS = "BUY_FREESPINS";
    public static final String BUY_SUPER_FREE_SPINS = "BUY_SUPER_FREESPINS";

    public static final String WHEEL = "WHEEL";

    private final BaseCommand baseCommand;


    public CommandHandler getGameHandler(String command) {
        switch (command) {
            case Command.BASE, Command.COLLECT, Command.EMPTY:
                return baseCommand;

            default:
                throw new IllegalArgumentException("Unknown command " + command);
        }
    }

    public boolean isBuyBonusCommand(String command) {
        return command.equals(BUY_FREESPINS) || command.equals(BUY_SUPER_FREE_SPINS);
    }

    public static int getBuyBonusRatio(String command) {

        if (command.equals(Command.BUY_FREESPINS)) {
            return 75;
        } else if (command.equals(Command.BUY_SUPER_FREE_SPINS)) {
            return 150;
        }
        return 1;
    }

}
