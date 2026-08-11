package com.pixiu.fortune8keno.fortune8keno.initialState;


import com.pixiu.fortune8keno.fortune8keno.dto.PlayerState;
import org.springframework.stereotype.Component;
import static com.pixiu.fortune8keno.fortune8keno.play.FreeSpinState.EMPTY;




@Component
public class InitialPlayerStateService {

  public PlayerState get() {
    PlayerState playerState = new PlayerState();
    playerState.setPlayerStatePublic(EMPTY);
    return playerState;
  }

}
