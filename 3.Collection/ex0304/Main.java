import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

// ハッシュセット
// 重複は許さないが、順番は問わない
class Main {
  public static void main(String args[]) {
    Set<String> hasT = new HashSet<>();
    // 要素収納
    hasT.add("赤");
    hasT.add("赤");  // 重複は無視される
    hasT.add("青");
    hasT.add("黄");
    hasT.add("緑");

    System.out.println("要素数を確認" + hasT.size());
    hasT.remove("緑");
    System.out.println("削除要素数を確認" + hasT.size());

    // ハッシュなので要素を単体で取り出すことができない
    // また、取り出すときの順番は決まっていない
    System.out.println("イテレータ");
    Iterator<String> it = hasT.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
