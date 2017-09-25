import java.util.*;

class Main {
  public static void main(String args[]) {
    Todoufuken();
    Seiseki();
    Souri();
  }
  public static void Todoufuken(){
    Set<String> todo = new HashSet<>();
    todo.add("東京");
    todo.add("北海道");
    todo.add("沖縄");

    System.out.println("Setでハッシュで出力");
    for (String s : todo) {
      System.out.println(s);
    }
  }
    public static void Seiseki(){
      int sum = 0;
      List<Integer> se = new ArrayList<>();
      se.add(100);
      se.add(30);
      se.add(80);

      System.out.println("listで配列で出力");
      for (int i :se) {
        System.out.println(i);
        sum += i;
      }
      System.out.println("平均値:" + (sum / se.size()));
    }
    public static void Souri(){
      Map<String,Integer> so = new HashMap<>();
      so.put("ほげほげ",4);
      so.put("ふーふー",3);
      so.put("バーバー",5);

      System.out.println("Mapでハッシュ");
      for (String key :so.keySet()) {
        System.out.println(key + ":" + so.get(key));
      }
    }
}
