import java.util.HashMap;
import java.util.Map;

// テーブル作製
public class Main {
  public static void main(String[] args) {
    String settb = "tb2";
    String host = "localhost";
    String db   = "db1";
    String user = "vagrant";
    String pass = "vagrant";


    System.out.println("処理スタート");

    // 接続のチェック
    // db接続テスト
    DBConnet dbcon1 = new CreatTb(
        host,db,user,pass,settb);
    // ドライバテスト
    dbcon1.setDriver();
    // テーブルチェク
    dbcon1.conTest();
    if(dbcon1.checkTable()){
      System.out.println("既存のテーブルがあります。被らない名前をつけてください");
      System.exit(1);
    }

    // テーブル作製
    // カラムの設定
    dbcon1.setCloum("NAME","PRICE","WEIGHT");
    // SQL操作
    dbcon1.setSql(settb);
    System.out.println("テーブル作製完了");

    // テーブルに値を入れつ
    DBConnet dbcon2 = new IntoRs(
    host,db,user,pass,settb);
    // 入れるテーブルの確認
     dbcon1.conTest();
    if(dbcon1.checkTable()){
      System.out.println("データを挿入するテーブルがありません!!!");
      System.exit(1);
    }
    // sqlセット
  }
}
