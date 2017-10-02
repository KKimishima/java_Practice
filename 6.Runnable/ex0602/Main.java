import java.util.function.*;

public class Main{
  public static void main (String[] args) {
    // subメソッドの処理ロジックを、変数funcに代入
    // 変数へのメソッド参照の収納
    //  変数 = クラス名::そのクラスの静的メソッド名
    //  変数 = インスタンス変数名::そのインスタンスのメソッド
    IntBinaryOperator func = Main::sub;
    //  変数funcに収納されている処理Logicを引き数と5と3で実行する
    int a = func.applyAsInt(5, 3);
    System.out.println("5-3は" + a);
  }

  // 2つの引数を受けて、その差を返す関数
  public static int sub(int a,int b){
      return a - b;
   }
}