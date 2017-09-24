package Kimishima;

class Main {
  public static void main(String args[]) {
    // 配列定数
    final int Max_len = 100;
    // 文字連結オブジェクト
    StringBuilder sb = new StringBuilder();
    
    //文字連結
    for (int i =0;i <Max_len;i++) {
      // 最後にドットを入れない
      if(i == 99){
        sb.append(i+1);
      }else{
        sb.append(i+1).append(",");
      }
    }
    
    // オブジェクトの参照付替え
    String s = sb.toString();
    // 文字列分離
    String[] a = s.split(",");

    // 結果出力
    System.out.println("文字列");
    System.out.println(s);
    System.out.println("配列");
    for (int i =0;i < Max_len;i++) {
      System.out.print(a[i]);
    }
  }
}
