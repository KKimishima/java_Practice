import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

// CSV読み込みの練習
public class Main {
  public static void main(String[] args) {
    try{
      // 読み込み設定
      String filePath = "/Volumes/data/Repo/java_Practice/10.FileFormat/ex1001/test.csv";
      FileReader readCsv = new FileReader(filePath);
      BufferedReader buffRead = new BufferedReader(readCsv);

      // 読み込んだファイルを一行ずつ処理
      String line;
      while ((line = buffRead.readLine()) != null){
        // 区切り文字","で分割
        StringTokenizer token = new StringTokenizer(line,",");

        // 分割した文字の表示
        while (token.hasMoreTokens()){
          System.out.println(token.nextToken());
        }
      }
      // 処理終了
      buffRead.close();
    }catch (IOException e ) {
      System.out.println("読み込み失敗");
    }
  }
}
