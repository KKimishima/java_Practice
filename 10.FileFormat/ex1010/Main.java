import java.io.*;

public class Main {
  public static void main(String[] args) {
    TestC t2;
    String setPath = "/Volumes/data/Repo/java_Practice/10.FileFormat/ex1007/test.dat";
    FileInputStream infile = null;
    try {
      infile = new FileInputStream(setPath);
      ObjectInput inObj = new ObjectInputStream(infile);
      t2 = (TestC)inObj.readObject();
      inObj.close();
      System.out.println(t2.getName());
      System.out.println(t2.getNum());

    }catch (IOException e){
      System.out.println("ファイル操作失敗");
    }catch (ClassNotFoundException e2){
      System.out.println("クラスファイルが見つかりません");
    }
  }
}
