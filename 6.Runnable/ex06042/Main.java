import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;

// ラムダ式の基本的な使い方
public class Main {
  public static void main(String[] args) {
    // 普通のループ
    ArrayList<Integer> a = new ArrayList<>() ;
    // 配列のセット
    a.add(0);
    a.add(1);
    a.add(2);
    a.add(3);
    // 普通のループ出力
    for (Integer x: a) {
      System.out.println(x);
    }
    // ラムダ式を使った
    a.stream().forEach(i ->  System.out.println(i));

    // 普通の関数呼び出し
    ArrayList<String> b = new ArrayList<>();
    b.add("ラムダ式");
    b.add("ストリーム");
    // 普通の関数呼び出し
    for (String x: b) {
     call(x) ;
    }
    // ラムダ式
    b.stream().forEach(i ->call(i));

  }
  public static void call(String z){
    System.out.println(z);
  }
}
