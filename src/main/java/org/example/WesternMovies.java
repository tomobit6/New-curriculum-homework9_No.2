package org.example;

import java.util.Map;

public class WesternMovies extends MovieBase {


  private final Map<String, Double> movieReviewMap;

  public WesternMovies(Map<String, Double> movieReviewMap) {
    this.movieReviewMap = movieReviewMap;
  }

  //abstractクラスの継承は必ずメソッドをオーバーライドする必要がある。
  @Override
  protected Map<String, Double> getMovieReviewMap() {
    return movieReviewMap;
  }

  @Override
  public void extraction() {
    System.out.println("高評価の洋画は以下の通りです。");
  }
}

