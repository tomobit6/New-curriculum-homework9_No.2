package org.example;

import java.util.Map;

public class JapaneseBestMovie extends JapaneseMovies {

  public JapaneseBestMovie(Map<String, Double> movieReviewMap) {
    super(movieReviewMap);
  }

  public Map<String, Double> reviewMap() {
    //maxKeyとmaxValueフィールドがクラスレベルで宣言していたが、reviewMapメソッド内でしか使わない。
    String maxKey = null;
    Double maxValue = 0.0;
    for (Map.Entry<String, Double> entry : super.getMovieReviewMap().entrySet()) {
      if (entry.getValue() > maxValue) {
        maxKey = entry.getKey();
        maxValue = entry.getValue();
      }
    }
    System.out.println("ちなみに、最も評価が高い邦画は、タイトル:" + maxKey + "　評価数：" + maxValue);
    return getMovieReviewMap();
  }
}
//抽象クラスは多重継承できないため、Overrideでメソッドを必ず呼び出さなければならない条件はない。
