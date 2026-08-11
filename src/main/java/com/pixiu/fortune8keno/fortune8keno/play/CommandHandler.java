package com.pixiu.fortune8keno.fortune8keno.play;


import com.pixiu.fortune8keno.fortune8keno.dto.play.PlayResponse;
import com.pixiu.fortune8keno.fortune8keno.results.SpinResult;

public interface CommandHandler<GameResult> {

  // template method for actual gameplay. Duplicated implementation in concrete classes left for easier reading without IDE.
  default SpinResult play(PlayRequestParameters playRequestParameters) {
    GameResult gameResult = playGame(playRequestParameters);

    return mapGameResponse(playRequestParameters, gameResult);
  }

  /**
   * Play the game
   *
   * @return game result
   */
  GameResult playGame(PlayRequestParameters playRequestParameters);



  /**
   * Map Game Response according to Game Server API requirements
   *
   * @return PlayResponse
   */
  SpinResult mapGameResponse(PlayRequestParameters playRequestParameters, GameResult gameResult);
}
