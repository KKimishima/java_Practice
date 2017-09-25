package Kimishima;
import  java.util.*;

public class Main {
  public static void main(String args[]) {
    //private final int MAX_SIZE = 2;
    final int MAX_SIZE = 2;
    // インスタンスの作成
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    // 配列のインスタンス
    List<Hero> st = new ArrayList<>();
    // 配列の収納
    st.add(h1);
    st.add(h2);
    // 配列の表示
    for (Hero h : st) {
      System.out.println(h.getName());
    }
  }
}
