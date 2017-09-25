import java.util.*;

class Main {
  public static void main(String args[]) {
    // mapインスタンス作成
    Map<Integer,String> pr = new HashMap<>();
    // ペアで収納
    pr.put(1,"hoge");
    pr.put(2,"hogehoge");
    pr.put(3,"foo");
    pr.put(4,"foofoo");
    pr.put(5,"bar");
    pr.put(6,"barbar");
  
    // 要素数と削除
    System.out.println("要素数:" + pr.size());
    pr.remove(6);
    System.out.println("削除済み要素数:" + pr.size());

    // 取り出し
    System.out.println("マップから取り出し(キー値,1):" + pr.get(1));
    System.out.println("マップから検索(キー値,1):" + pr.containsKey(1));
    System.out.println("マップから検索(バリュー値,bar):" + pr.containsValue("bar"));
    System.out.println("収納されているキー一覧を返す:" + pr.keySet());
    
    // 全要素吐き出し
    for(int key : pr.keySet()){
        System.out.println("吐き出し" + key + ":" + pr.get(key));
    }
  }
}
