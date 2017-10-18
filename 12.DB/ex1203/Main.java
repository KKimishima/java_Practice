import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 更新系SQL
public class Main {
  public static void main(String[] args) {
    String host = "192.168.33.11";
    String db   = "testdb1";
    String tb   = "tb1";
    String port = "3306";
    String user = "vagrant";
    String pass = "vagrant";

    System.out.println("処理開始");
    // ドライバ読み込み
    try{
      Class.forName("org.mariadb.jdbc.Driver");
    }catch (ClassNotFoundException e1){
      System.out.print("ドライバ読み込み失敗");
      e1.printStackTrace();
    }

    // 接続用変数
    Connection con = null;

    // 接続
    try{
      // 接続用設定
      con = DriverManager.getConnection(
          "jdbc:mariadb://" + host + ":" + port + "/" + db,user,pass
      );
      // SQL雛形作製
      PreparedStatement rs = con.prepareStatement(
        "DELETE FROM " + tb + " WHERE name = ?"
      );
      // 流し込み
      rs.setString(1,"元");
      // クエリを実行して結果の収納
      int result = rs.executeUpdate();
      // 結果を表示
      if(result != 0){
        System.out.println(result + "件のデータを削除しました");
      }else {
        System.out.println("該当するデータはありません");
      }
      // データベース切断
      con.close();
    }catch (SQLException e2){
      System.out.print("DB接続失敗");
      e2.printStackTrace();
      // 切断例外処理
    }finally {
      try{
        if(con != null){
          con.close();
        }
      }catch (SQLException e3){
        System.out.println("DB切断失敗");
        e3.printStackTrace();
      }
    }
    System.out.println("処理終了");
  }
}
