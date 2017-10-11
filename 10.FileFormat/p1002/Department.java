import java.io.Serializable;

// 部署クラス
public class Department implements Serializable {
  private String   name;
  private Employee leader;
  public Department(String x,Employee y){
    this.name = x;
    this.leader = y;
  }

  public String getName() {
    return name;
  }

  public Employee getLeader() {
    return leader;
  }
}
