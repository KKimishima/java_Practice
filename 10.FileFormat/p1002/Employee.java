import java.io.Serializable;

// 社員クラス
public class Employee implements Serializable{
  private String  name;
  private int     age;
  public Employee(String x,int y){
    this.name = x;
    this.age = y;
  }

  // getter
  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
