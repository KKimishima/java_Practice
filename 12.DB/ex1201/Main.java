// mariadbに接続テスト

import static java.lang.Class.forName;
import java.sql.*;

public class Main {
  public static void main(String[] args) {
    String hostname = "192.168.33.11";
    String dbname   = "testdb1";
    String port     = "3306";
    String username = "vagrant";
    String password = "vagrant";

    // ドライバ読み込みテスト
    try{
      // jdbcドライバの有効化
      Class.forName("org.mariadb.jdbc.Driver");
    }catch (ClassNotFoundException e1){
      System.out.println("ドライバー読み込み失敗");
      e1.printStackTrace();
    }

    // 接続用のインスタンスの入れ物用意
    Connection con = null;
    try{
      // データベースに接続
      con = DriverManager.getConnection("jdbc:mariadb://" + hostname +
          ":" + port + "/" + dbname,username,password);
    }catch (SQLException e2){
      System.out.println("データベース接続失敗");
      e2.printStackTrace();
    }finally {
      // DB接続の切断
      try {
        if (con != null) {
          con.close();
        }
      } catch (SQLException e3) {
        System.out.println("データベース切断失敗");
        e3.printStackTrace();
      }
    }
  }
}
