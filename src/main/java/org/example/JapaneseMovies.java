package org.example;

import java.util.Map;

public class JapaneseMovies extends MovieBase {

  private final Map<String, Double> movieReviewMap;

  public JapaneseMovies(Map<String, Double> movieReviewMap) {
    this.movieReviewMap = movieReviewMap;
  }

  //abstractクラスの継承は必ずメソッドをオーバーライドする必要がある。
  @Override
  protected Map<String, Double> getMovieReviewMap() {
    return movieReviewMap;
  }

  //継承は親クラスのインターフェースも継承することができるため、implementsをしなくてもOverrideできる。
  @Override
  public void extraction() {
    System.out.println("高評価の邦画は以下の通りです。");
  }
}
