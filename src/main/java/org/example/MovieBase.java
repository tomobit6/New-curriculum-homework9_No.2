package org.example;

import java.util.Map;

public abstract class MovieBase implements Checking {

  protected abstract Map<String, Double> getMovieReviewMap();

  public Map<String, Double> reviewMap() {
    getMovieReviewMap().entrySet().stream()
        .filter(entry -> entry.getValue() >= 4.0)
        .map(entry -> "タイトル:" + entry.getKey() + "　評価数：" + entry.getValue())
        .forEach(System.out::println);
    return getMovieReviewMap();
  }
}
