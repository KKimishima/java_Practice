public class Main {
  public static void main(String args[]) {
    String  s1 = "javajava JavaScript5";
    // 文字列部分探索
    // public boolean contains(String s) 
    System.out.println("###文字列部分探索###");
    if(s1.contains("pt")){
      System.out.println("文字一致あり");
    }else{
      System.out.println("文字不一致");
    }

    // 先頭文字探索
    // public boolean startWith(String s)
    System.out.println("#文字列先頭文字検索#");
    if(s1.startsWith("j")){
      System.out.println("先頭文字一致");
    }else{
      System.out.println("先頭文字不一致");
    }
    
    // 最後の文字列探索
    // public boolean endsWith(String s)
    System.out.println("#文字列最後文字検索#");
    if(s1.endsWith("t")){
      System.out.println("最後文字一致");
    }else{
      System.out.println("最後文字不一致");
    }

    // 文字,数字が最初に出てくる場所の検索
    // public int indexOf(int ch)
    // public String indexOf(String si,int ch)開始位置
    System.out.println("##部分一致先頭探索##");
    System.out.println("文字列:" + s1.indexOf("a",9));
    System.out.println("##部分一致後方探索##");
    System.out.println("文字列:" + s1.indexOf("a",11));

    // 文字を切り出す
    // public char charAt(int index)(0からスタート)
    System.out.println("#指定位置から一文字#");
    System.out.println("切り出し:" + s1.charAt(7));

    // 文字列の切り出さし
    // public String substrig(int index,int endindex)
    System.out.println("#指定位置から文字列#");
    System.out.println("切り出し:" + s1.substring(4,8));
    
    // 文字列の変換
    System.out.println("##大文字から小文字##");
    System.out.println("切り出し:" + s1.toLowerCase());
    System.out.println("##小文字から大文字##");
    System.out.println("切り出し:" + s1.toUpperCase());
    System.out.println("##前後空文字の削除##");
    System.out.println("切り出し:" + s1.trim());
    System.out.println("##文字列の置き換え##");
    System.out.println("置換:" + s1.replace("va","__"));

    // 文字連結
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append("Hello");
    sb.append("World");
    System.out.println("文字連結 :" + sb);
    // メソッドチェーン
    System.out.println("文字連結 :" + sb2.append("java").append("java").append("java"));
    
  }
}
