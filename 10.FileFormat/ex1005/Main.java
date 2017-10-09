import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// プロパティファイルの読み込み
public class Main {
  public static void main(String[] args) {
   String setPath = "/Volumes/data/Repo/java_Practice/10.FileFormat/ex1004/test.properties";
   try {
     FileReader fr = new FileReader(setPath);
     Properties p = new Properties();

     // プロパティの読み込み
     p.load(fr);

     // プロパテの引き出しし
     String name  = p.getProperty("Name");
     String hp    = p.getProperty("HP");
     String mp    = p.getProperty("MP");

     // プロパティの読み出し
     System.out.println(name);
     System.out.println(Integer.parseInt(hp));
     System.out.println(Integer.parseInt(hp));

     fr.close();
   }catch (IOException e){
      System.out.println("ファイル操作失敗");
   }
  }

}
