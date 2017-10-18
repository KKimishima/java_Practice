import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CreatTb extends DBConnet{
  private String tb;
  private ArrayList<String> colum;

  public CreatTb(String host, String db, String user, String pass,String tb){
    super(host,db,user,pass);
    this.tb = tb;
  }

  // Sql
  @Override
  public void setSql(String tb){
    this.tb = tb;
    Connection con  = null;
    try{
      con = DriverManager.getConnection(
          "jdbc:mariadb://"+super.getHost()+":"+super.getPort()+"/"+super.getDb(),
          super.getUser(),super.getPass());
      // sqlの雛形を作製
      PreparedStatement cre = con.prepareStatement(
          "create table tb2("+colum.get(0)+" varchar(10),"+colum.get(1)+" int,"+colum.get(2)+" int);"
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

  // セットカラム
  public void setCloum(String x,String y,String z){
    colum = new ArrayList();
    colum.add(x);
    colum.add(y);
    colum.add(z);
  }
}
