package Kimishima;
import  java.util.*;

public class Main {
  public static void main(String args[]) {
    // インスタンス生成
    Result h1 = new Result("斎藤",3);
    Result h2 = new Result("鈴木",7);
    // マップインスタンス作成
    List<Result> li = new ArrayList<>();
    // 配列に収納
    li.add(h1);
    li.add(h2);
   
    System.out.println("継承を使った場合");
    for (Result h : li){
      System.out.println(h.getName() + ":" + h.getPoint());
    }
    mapP();
  }
  public static void mapP(){
     // インスタンス生成
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    // マップインスタンス作成
    Map<Hero,Integer> ma = new HashMap<>();
    // 配列に収納
    ma.put(h1,3);
    ma.put(h2,7);
    
    System.out.println("オブジェクトとIntegerのセット");
    for (Hero h :ma.keySet()) {
      System.out.println(h.getName() + ":" + ma.get(h));
    }
  }
}
