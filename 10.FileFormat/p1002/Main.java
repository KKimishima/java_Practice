import java.io.*;

public class Main {
  public static void main(String[] args) {
    Employee staff = new Employee("鈴木",41);
    Department busyo = new Department("総務",staff);


    String path = "/Volumes/data/Repo/java_Practice/10.FileFormat/p1002/save.dat";
    FileOutputStream fo = null;
    ObjectOutputStream oo = null;
    try{
      fo = new FileOutputStream(path);
      oo = new ObjectOutputStream(fo);
      oo.writeObject(busyo);
      oo.flush();
      oo.close();
    }catch (IOException e){
      System.out.println("ファイル操作失敗");
      System.out.println(e);
    }//finally {
     // if (oo != null){
    //    oo.close();
    //  }
     // if(fo != null){
     //   fo.close();
     // }
   // }
  }
}
