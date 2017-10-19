import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

// テーブル作製
abstract public class DBConnet {
  private String host;
  private String db;
  final private  String  port = "3306";
  private String user;
  private String pass;

  // コンストラクタ
  public DBConnet(String host, String db, String user, String pass){
    this.host = host;
    this.db   = db;
    this.user = user;
    this.pass = pass;
  }

  // getter
  public String getHost() { return host; }
  public String getDb()   { return db; }
  public String getPort() { return port; }
  public String getPass() { return pass; }
  public String getUser() { return user; }

  public void setDriver(){
    try {
      Class.forName("org.mariadb.jdbc.Driver");
    }catch (ClassNotFoundException e1){
      System.out.println("ドライバ読み込み失敗");
      e1.printStackTrace();
      System.exit(1);
    }
  }

  public void conTest(){
    Connection con = null;
    try{
      con = DriverManager.getConnection(
          "jdbc:mariadb://"+host+":"+port+"/"+db,user,pass);
      con.close();
    }catch (SQLException e2){
      System.out.println("DB接続失敗");
      e2.printStackTrace();
      System.exit(2);
    }
  }
  abstract void setSql(String tb);
  abstract void setCloum(String x,String y,String z);
  abstract boolean checkTable();

}
