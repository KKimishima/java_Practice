//正規表現練習

class Regular {
  public static void main(String args[]) {
    String  s1 = "java";
    String  s2 = "java";
    String  s3 = "j.va";
    String  s4 = "j.*v.*";
    String  s5 = "jjjava";
    String  s6 = "j{3}ava";
    String  s7 = "[a-z]";
    //普通一致
    regular1(s1,s2);
    //任意の一文字であればより
    regular2(s1,s3);
    //直前の0回以上の繰り返し
    regular3(s1,s4);
    //ブロックカッコを使った指定回数繰り返し
    regular5(s5,s6);
    //角カッコ:いずれかの文字
    regular6(s5,s6);
    // splitメソッドを使って文字分割
    split_method();
    // replaceAll()メソッドをつかった文字置換
    replaceAll_method();
    // 文字フォーマット
    StrigFormat();
  }
  //  普通の一致
  public static void regular1(String s1,String s2){
    System.out.println("普通文字の一致:" + s1.matches(s2));
  }
  // ピリオド,任意の一文字であれば良い
  public static void regular2(String s1,String s3){
    System.out.println("任意の一文字:" + s1.matches(s3));
  }
  // アスタリスク:直前の0回以上の繰り返し
  // .*で含まれる任意の文字を探す
  public static void regular3(String s1,String s4){
    System.out.println("直前の0回以上の繰り返し:" + s1.matches(s4));
  }
  //ブロックカッコを使った指定回数繰り返し
  public static void regular5(String s5,String s6){
    System.out.println("ブロックカッコの繰り返し:" + s5.matches(s6));
  }
  // 角括弧:いずれかの文字
  public static void regular6(String s1,String s7){
    System.out.println("角括弧でいずれかの文字:" + s1.matches(s7));
    System.out.println("角括弧でいずれかの数字:" + s1.matches("[¥d]"));
    System.out.println("角括弧でいずれかの文字:" + s1.matches("[¥w]"));
  }
  public static void split_method(){
    String    s = "abs,sssa,a,aaa";
    String[]  work = s.split("[,:]");

    System.out.println("文字分割");
    System.out.println(s);

    for (String w : work) {
      System.out.print(w + "->");
    }
    System.out.println("");
  }
  public static void replaceAll_method(){
    String  s = "abs,sssa,a,aaa";
    String  w = s.replaceAll("[a]","_");
    
    //
    System.out.println("文字置換aから_");
    System.out.println(s);

   System.out.println("置換済み:" + w);
  }
  public static void StrigFormat(){
    String[] s = {"hoge","hogehoge"};
    int[] i = {1,2};
    final String FORMAT ="テスト%-3d%-8s";

    String sf = String.format(FORMAT,i[0],s[0]);
    System.out.println(sf);
  }
}
