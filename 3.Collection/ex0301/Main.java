import  java.util.ArrayList;
import  java.util.Iterator;

class Main {
  public static void main(String args[]) {
//    ArrayList<Integer> points = new ArrayList<Integer>(); // Integer型でArrayListを宣言
    ArrayList<Integer> points = new ArrayList<>(); // 上記の方法でもOK
    // 要素を収納する.add
    points.add(10); // 自動的にInteger型に変換される
    points.add(2);
    points.add(333);
    points.add(0);
    points.add(10);

    // 要素を取り出す
    System.out.println("表示                      :" + points.get(0));
    System.out.println("書き換え前                :" + points.get(0));
    points.set(0,111);
    System.out.println("書き換え後                :" + points.get(0));

    // リストを調査する
    System.out.println("要素数                    :" + points.size());
    System.out.println("要素数がゼロであるか判別  :" + points.isEmpty());
    System.out.println("指定要素数があるか判別(0) :" + points.contains(0));
    System.out.println("指定要素が何番目にあるか検索:" + points.indexOf(333));

    // 削除
    System.out.println("削除前                    :" + points.get(0));
    System.out.println("削除前要素数              :" + points.size());
    points.remove(0);
    System.out.println("削除後                    :" + points.get(0));
    System.out.println("削除後要素数              :" + points.size());

    // イテレーター
    System.out.println("イテレーター");
    Iterator<Integer> setPoint = points.iterator(); // イテレータの習得(配列の要素の前にポイントされてる)
    while (setPoint.hasNext()) {  // 次の要素に進めるか判別
      int po = setPoint.next();     // 次の要素に進め、内容の取り出し
      System.out.println(po);
    }

    // 全削除
    points.clear();
    System.out.println("全削除要素数              :" + points.size());

  }
}
