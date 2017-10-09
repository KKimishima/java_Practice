import java.io.Serializable;

// テストクラス
public class TestC implements Serializable {
  // フィールド
  private String  name;
  private int     num;

  // コンストラクタ
  public TestC(String x,int y){
    this.name = x;
    this.num  = y;
  }

  // getter
  public String getName(){
    return this.name;
  }
  public int getNum(){
    return this.num;
  }
}
