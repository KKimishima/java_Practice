class Main {
  public static void main(String args[]) {
    String s1 = "hogehoge";
    String s2 = "HogeHoge";
    String s3 = "barbar";
//    String s4 = "i";
    String s4 = "";

    // 内容が同じ確認
    // public boolean equals(Object o)
    System.out.println("##########文字列比較#######");
    if(s1.equals(s2)){
      System.out.println("**等しいです**");
    }else{
      System.out.println("**間違いです**");
    }
    System.out.println();

    // 文字の大小を区別せずに比較
    // public boolean equalsLgnoeCase(String s)
    System.out.println("##大小比較しない文字列比較##");
    if(s1.equalsIgnoreCase(s2)){
      System.out.println("**等しいです**");
     }else{
      System.out.println("**間違いです**");
    }
    System.out.println();
   
    // 文字の長さを調べる
    // public int leght()
    System.out.println("##########文字列長さ#######");
    System.out.println("文字の長さを調べるs1 = hogehoge :" +  s3.length());
    System.out.println("");

    // 空文字か調べる
    // public boolean isEmpty()
    if(s4.isEmpty()){
      System.out.println("空文字があります");
    }else{
      System.out.println("空文字なし");
    }
  }
}
