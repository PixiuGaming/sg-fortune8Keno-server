package com.pixiu.fortune8keno.fortune8keno.dto;


import com.pixiu.fortune8keno.fortune8keno.play.FreeSpinState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class PlayerState {

  private FreeSpinState playerStatePublic;


  public PlayerState(FreeSpinState playerStatePublic) {
    this.playerStatePublic = playerStatePublic;
  }



}
