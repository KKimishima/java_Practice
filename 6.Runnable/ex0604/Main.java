// ラムダ式

import java.util.function.*;
public class Main {
  public static void main(String[] args){
    // ２つの引き数の差を求める処理を実体を生み出し,代入する
    // この行実行された瞬間,実体が生み出される
    IntBinaryOperator func = (int x,int y) -> {return x - y;};
    int a = func.applyAsInt(10,6);
    System.out.println(a);
  }
}
