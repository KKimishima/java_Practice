// 関数格納用のインターフェイスを宣言して利用する
public class Main {
  public static void main(String[] args){
    //インタフェイスで定義した関数に変数を代入
    MyFunction f = Main::sub;
    // インターフェイスを返して実行
    int a = f.call(5,6);
    System.out.println("5 + 6=" +  a);
  }
  // インターフェイスの実装
  public static int sub(int x,int y){
    return x + y;
  }
}
