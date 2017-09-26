public class Main {
  public static void main(String args[]) {
    Pokcet[] t1 = new Pokcet[3];
    for(int i = 0;i <3;i++){
      t1[i] = new Pokcet();
    }
    t1[0].put("文字列");
    t1[1].put(1234);
    t1[2].put(0.15);

    // キャストしないと危険
    // 間違えるとエラーを出す
    System.out.println("Pokcetクラス吐き出し:" + (String)t1[0].get());
    System.out.println("Pokcetクラス吐き出し:" + (Integer)t1[1].get());
    System.out.println("Pokcetクラス吐き出し:" + (Double)t1[2].get());
    GenOb();
  }
  // ジェンリクスを使ったばあい
  public static void GenOb(){
    GPokcet<String> t2 = new GPokcet<>();
    t2.put("Test");
    System.out.println("ジェネリクス吐き出し:" +t2.get());
    //}
  }
}
