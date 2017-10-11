import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

// プロパテの設定
public class Main {
  public static void main(String[] args) {
    String setPath = "/Volumes/data/Repo/java_Practice/10.FileFormat/p1001/test.properties";
    FileReader rf = null;
    try{
      // Objectのセット
      rf = new FileReader(setPath) ;
      Properties pf = new Properties();

      // プロパティの読み込み
      pf.load(rf);

      // 要素の読み込み
      ArrayList<String> parrray = new ArrayList<>();
      parrray.add(pf.getProperty("tokyo.capital"));
      parrray.add(pf.getProperty("aichi.capital"));
      parrray.add(pf.getProperty("tokyo.food"));
      parrray.add(pf.getProperty("aichi.food"));

      // 画面表示
      System.out.println(parrray.get(0)  +":" + parrray.get(2));
      System.out.println(parrray.get(1)  +":" + parrray.get(3));

      // ファイルを閉じる
      rf.close();

    }catch (IOException e1){
      System.out.println("ファイル読み込み失敗");
      System.out.println(e1);
    }
  }
}
