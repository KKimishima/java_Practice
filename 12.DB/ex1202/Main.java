import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

// 検索系SQL
public class Main {
  public static void main(String[] args) {
    // 各種設定
    String host = "192.168.33.11";
    String db = "testdb1";
    String tb = "tb1";
    String port = "3306";
    String user = "vagrant";
    String pass = "vagrant";
    int age     = 0;

    System.out.println("検索システム起動");
    System.out.println("検索する年を入力してください");
    System.out.print("年齢:");

    // 入力
    try{
      age = new Scanner(System.in).nextInt();
    }catch (InputMismatchException e){
      System.out.println("半角数値で入力してください");
      e.getStackTrace();
    }

    // ドライバ読み込み
    try {
      Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException e1) {
      System.out.println("ドライバ読み込み失敗");
      e1.printStackTrace();
    }

    // 接続用変数
    Connection con = null;
    // 接続
    try{
      System.out.println("検索開始");
      con = DriverManager.getConnection("jdbc:mariadb://" + host + ":" +
            port + "/" + db,user,pass);

      // 検索系SQL
      // 送信するSQL文の雛形
      PreparedStatement pstmt = con.prepareStatement
          ("SELECT * FROM " + tb + " WHERE tosi = ? ");
      // 雛形に流し込み
      // ?の一番目に流し込み
      pstmt.setInt(1,age);
      // クエリ送信
      ResultSet rs = pstmt.executeQuery();

      // 画面に表示
      System.out.print("結果:");
      // クエリにヒットするか
      if(rs.next()){
        System.out.println("Hit!!!");
        System.out.println(rs.getString("bang") + ":"+ rs.getString("name"));
      }else{
        System.out.println("該当なし");
      }

      // 最終行まで繰り返す
      while (rs.next()){
        System.out.println(rs.getString("bang") + ":"+ rs.getString("name"));
      }

      // あと片付け
      rs.close();
      con.close();
    }catch (SQLException e2){
      System.out.println("db接続失敗");
      e2.printStackTrace();
      // 切断
    }finally {
      try{
        if (con != null){
          con.close();
        }
      }catch (SQLException e3){
        System.out.println("db切断失敗");
        e3.printStackTrace();
      }
    }
    System.out.println("db処理終了");
  }
}
