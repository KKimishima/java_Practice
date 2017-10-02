// メンバクラスの宣言
public class Outer {
  private int outerF = 0;
  private static int outerSF =  0;
  //インナークラス
  public static class Inner{
    public void InnerMethod(){
      // staticな外部クラスメンバのみが利用可能
      outerSF = 10;
    }
  }
  public void OuterMethod(){
    // 外部からはInnerクラスで利用可能
    Inner ic = new Inner();
  }
  public int  getOuterF(){return this.outerF;}
  public int  getOuterSF(){return this.outerSF;}
}

class Main {
  public static void main(String args[]) {
    Outer.Inner ic = new Outer.Inner();
    Outer ic2 = new Outer();
    System.out.println("インナークラスメソッド前" + ic2.getOuterSF());
    ic.InnerMethod();
    System.out.println("インナークラスメソッド後" + ic2.getOuterSF());
  }
}
