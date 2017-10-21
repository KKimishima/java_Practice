import java.sql.*;
import java.util.ArrayList;

public class IntoRs extends DBConnet{
  private String tb;
  private ArrayList<String> dataset;

  // コンストラクタ
  public IntoRs(String host, String db, String user, String pass,String tb) {
    super(host, db, user, pass);
    this.tb = tb;
  }

  // テーブルチェック
  @Override
  public  boolean checkTable(){
    Connection con  = null;
    try{
      con = DriverManager.getConnection(
          "jdbc:mariadb://"+super.getHost()+":"+super.getPort()+"/"+super.getDb(),
          super.getUser(),super.getPass());
      // sqlの雛形を作製
      PreparedStatement cre = con.prepareStatement(
          "show tables like ?;"
      );
      // sqlに流し込み
      // sql実行
      cre.setString(1,this.tb);
      ResultSet r = cre.executeQuery();
      // 成功失敗判別
      if (r.next()) {
        con.close();
        return false;
      }
    }catch (SQLException e2){
      System.out.println("SQL実行失敗");
      e2.printStackTrace();
      System.exit(2);
    }
    return true;
  }

  @Override
  public void setCloum(String x,String y,String z){
    dataset = new ArrayList<>();
    dataset.add(x);
    dataset.add(y);
    dataset.add(y);
  }

  @Override
  public void setSql(String tb){
    Connection con  = null;
    try{
      con = DriverManager.getConnection(
          "jdbc:mariadb://"+super.getHost()+":"+super.getPort()+"/"+super.getDb(),
          super.getUser(),super.getPass());
      // sqlの雛形を作製
      PreparedStatement cre = con.prepareStatement(
          "insert into "+this.tb+" values("+dataset.get(0)+"999,999)"
          "in table "+this.tb+"("+colum.get(0)+" varchar(10),"+colum.get(1)+" int,"+colum.get(2)+" int);"
      );
      // sqlに流し込み
      // sql実行
      cre.executeUpdate();
      con.close();
    }catch (SQLException e2){
      System.out.println("SQL実行失敗");
      e2.printStackTrace();
      System.exit(2);
    }
  }

}
