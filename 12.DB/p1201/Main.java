import java.util.HashMap;
import java.util.Map;

// テーブル作製
public class Main {
  public static void main(String[] args) {
    System.out.println("処理スタート");
    // db接続テスト
    DBConnet dbcon1 = new CreatTb(
        "192.168.33.11","testdb1","vagrant","vagrant","tb3");
    // ドライバテスト
    dbcon1.setDriver();
    // db接続テスト
    dbcon1.conTest();
    if(dbcon1.checkTable()){
      System.out.println("既存のテーブルがあります¥n被らない名前をつけてください");
      System.exit(1);
    }
    // カラムの設定
    dbcon1.setCloum("NAME","PRICE","WEIGHT");
    // SQL操作
    dbcon1.setSql("tb2");
    System.out.println("処理完了");
  }
}
