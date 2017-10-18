import java.util.HashMap;
import java.util.Map;

// テーブル作製
public class Main {
  public static void main(String[] args) {
    System.out.println("処理スタート");
    // db接続テスト
    DBConnet dbcon1 = new CreatTb(
        "192.168.33.11","testdb1","vagrant","vagrant","tb1");
    // ドライバテスト
    dbcon1.setDriver();
    // db接続テスト
    dbcon1.conTest();
    // カラムの設定
    dbcon1.setCloum("NAME","PRICE","WEIGHT");
    // SQL操作
    dbcon1.setSql("tb2");
    System.out.println("処理完了");
  }
}
