// 正規表現
import java.util.*;

public class Main {
  public static void main(String args[]) {
    // 必ず8文字である
    // A~Zと0~9が有効
    // 最小の文字は数字ではならない
  
    System.out.println("#######文字入力#######");
    System.out.println("必ず8文字である");
    System.out.println("A~Zと0~9が有効");
    System.out.println("最小の文字は数字ではならない");
    System.out.print("入力:" );
    String s1 = new Scanner(System.in).next();
  
    // matches
    if(s1.matches("[A-Z][A-Z0-9]{7}")){
      System.out.println("一致");
    }else{
      System.out.println("不一致");
    }
  }
}
