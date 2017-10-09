import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
  public static void main(String[] args) {
    // インスタンス作製
    TestC t1 = new TestC("テスト1",1);

    // 内容確認
    System.out.println("初回インスタンス内容確認");
    System.out.println(t1.getName());
    System.out.println(t1.getNum());

    // インスタンスの直列化と保存
    try {
      String setPath = "/Volumes/data/Repo/java_Practice/10.FileFormat/ex1007/test.dat";
      FileOutputStream instaOut = new FileOutputStream(setPath);

      //オブジェクトして保存
      ObjectOutputStream objOut = new ObjectOutputStream(instaOut);

      // インスタンスをバイト列
      objOut.writeObject(t1);
      objOut.flush();
      objOut.close();
    }catch (IOException e){
      System.out.println("ファイル操作失敗");
    }
  }
}
