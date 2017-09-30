// 匿名クラスの利用例
public class Main {
  public static void main(String args[]) {
    // 匿名クラス
    // new インターフェイス名(){実装}
    Tokumei to = new Tokumei() {
      public void print(){
        System.out.println("匿名クラス");
      }
    };
    to.print();
  }
}

interface Tokumei{
  void print();
} 
