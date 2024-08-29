package org.example;

import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<String, Double> japaneseMoviesMap = Map.of(
        "SLAMDUNK", 4.3,
        "千と千尋の神隠し", 4.1,
        "22年目の告白私が殺人犯です", 3.6,
        "怒り", 3.9,
        "横道世之介", 3.9
    );
    Checking japaneseMovies = new JapaneseMovies(japaneseMoviesMap);
    japaneseMovies.extraction();
    Map<String, Double> movieReview = japaneseMovies.reviewMap();

    System.out.println("----------------------------------------------------");
    Map<String, Double> westernMovieMap = Map.of(
        "ショーシャンクの空に", 4.3,
        "インセプション", 4.1,
        "ゴーンガール", 3.8,
        "MASK", 3.7,
        "天使がくれた時間", 3.9
    );
    Checking westernMovies = new WesternMovies(westernMovieMap);
    westernMovies.extraction();
    Map<String, Double> movieReview2 = westernMovies.reviewMap();

    System.out.println("----------------------------------------------------");
    System.out.println("今日はどれにしますか？");
    Checking japaneseMovie = new JapaneseBestMovie(japaneseMoviesMap);
    Map<String, Double> japaneseBestMovie = japaneseMovie.reviewMap();
  }
}
