package Chapter08.Question03;


/*
  8-3 마술 인덱스: 배열 A[0...n-1] 에서 A[i]=i 인 인덱스를 마술 인덱스라 정의한다.
  정렬된 상태의 배열이 주어졌을 때, 마술 인덱스가 존재하다면 그 값을 찾는 메서드를 작성해라.
  배열 안에 중복된 값은 없다!.

 */

import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] indexs = new int[5];


  }

  public static int[] createMagicIndex( int[] indexs) {
    for(int i=0; i < indexs.length ; i++) {
      indexs[i] = i;
    }
    return indexs;
  }

  public static List<Integer> getMagicIndex(int[] indexs) {

    return null;
  }

}
