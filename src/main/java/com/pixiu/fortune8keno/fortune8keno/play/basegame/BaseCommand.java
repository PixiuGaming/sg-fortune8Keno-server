package com.pixiu.fortune8keno.fortune8keno.play.basegame;


import com.pixiu.fortune8keno.fortune8keno.dto.play.PlayResponse;
import com.pixiu.fortune8keno.fortune8keno.play.CommandHandler;
import com.pixiu.fortune8keno.fortune8keno.play.PlayRequestParameters;
import com.pixiu.fortune8keno.fortune8keno.results.SpinResult;
import com.pixiu.fortune8keno.fortune8keno.spin.SpinGameResponseMapper;
import com.pixiu.fortune8keno.fortune8keno.spin.SpinGameResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BaseCommand implements CommandHandler<SpinGameResult> {

  private final SpinGameResponseMapper spinGameResponseMapper;
  private final BaseGame baseGame;


  @Override
  public SpinResult play(PlayRequestParameters playRequestParameters) {
    SpinGameResult spinGameResult = playGame(playRequestParameters);

    return mapGameResponse(playRequestParameters, spinGameResult);
  }

  @Override
  public SpinGameResult playGame(PlayRequestParameters playRequestParameters) {
    return baseGame.play(playRequestParameters);
  }

  @Override
  public SpinResult mapGameResponse(PlayRequestParameters playRequestParameters, SpinGameResult spinGameResult) {
    return spinGameResponseMapper.getPlayResponse(playRequestParameters, spinGameResult);
  }


}
