import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// プロパティへの書き込み
public class Main{
  public static void main(String[] args) {
    String setPath = "/Volumes/data/Repo/java_Practice/10.FileFormat/ex1004/test.properties";
    FileWriter fw = null;
    try {
      fw = new FileWriter(setPath);
      // プロパティ書き出し
      Properties p = new Properties();

      // プロパティの設定
      p.setProperty("Name","テスト");
      p.setProperty("HP","100");
      p.setProperty("MP","50");
      p.store(fw,"設定");

      fw.flush();
      fw.close();
    }catch (IOException e){
     System.out.println("書き出し失敗");
    }
  }
}