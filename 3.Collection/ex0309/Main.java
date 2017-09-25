import  java.util.*;

class Sup{
  public String name;
}

class Main {
  public static void main(String args[]) {
    // インスタンス
    Sup s = new Sup();
    // クラスのフィールドにぶっこみ
    s.name = "テスト1";

    // コレクション
    List<Sup> st = new ArrayList<Sup>();
    st.add(s); // リストに代入

    s.name = "テスト2"; // リストに代入後に切り替え
    //st.get(0).name = "テスト3"; //こっちのほうが丁寧な書き方
    System.out.println(st.get(0).name);

  }
}
