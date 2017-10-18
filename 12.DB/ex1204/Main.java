import java.sql.*;
import java.util.ArrayList;

// トランザクション
public class Main {
  public static void main(String[] args) {
    ArrayList<String> dbSet = new ArrayList<>();
    dbSet.add("192.168.33.11");
    dbSet.add("testdb1");
    dbSet.add("tb1");
    dbSet.add("3306");
    dbSet.add("vagrant");

    System.out.println("処理開始");

    // ドライバ接続
    try{
      Class.forName("org.mariadb.jdbc.Driver");
    }catch (ClassNotFoundException e1){
      System.out.println("ドライバ読み込み失敗");
    }

    // 接続インスタンス
    Connection con = null;

    // 接続
    try{
      con = DriverManager.getConnection(
          "jdbc:mariadb://"+ dbSet.get(0)+":"+ dbSet.get(3)+"/"+dbSet.get(1),dbSet.get(4),dbSet.get(4)
      );
      // 手動コミットモードに切り替え
      con.setAutoCommit(false);
      // SQL雛形作製
      // 削除系
      PreparedStatement rs1 = con.prepareStatement(
          "DELETE FROM "+dbSet.get(2)+" WHERE bang = ?");
      // 新規作製
      PreparedStatement rs2 = con.prepareStatement(
          "INSERT INTO "+dbSet.get(2)+" values(?,?,?)");
      // ?に流し込み
      rs1.setString(1,"A4");
      rs2.setString(1,"A4");
      rs2.setString(2,"鈴木");
      rs2.setInt(3,42);
      // SQL送信処理送信
      rs1.executeUpdate();
      rs2.executeUpdate();
      // トランザクションのコミット
      con.commit();
      // 切断
      con.close();
    }catch (SQLException e2){
      // 失敗時のロールバック
      try{
        con.rollback();
      }catch (SQLException e4){
        System.out.println("失敗ロールバック");
        e2.printStackTrace();
      }
      System.out.println("接続失敗");
      e2.printStackTrace();
      // 切断処理
    }finally {
      try{
        if (con != null){
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
