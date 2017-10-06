import java.io.FileWriter;
import java.io.IOException;

// ファイル操作の例外処理
public class Main {
  public static void main(String[] args) {
// 例外を起こす場合
//    String path = "/Volumes/data/Repo/java_Practice/9.Files/ex0903/test.txt";
    String path = "/Volumes/data/Repo/java_Practice/9.Files/ex0902/test.txt";
    // tryブロック外で宣言しnullで初期化しないとfinallyブロック内でclose()をよべない
    FileWriter fw = null;
    try {
      fw = new FileWriter(path,true);
      fw.write("例外処理での書き込み");
      fw.flush();
      System.out.println("書き込み成功");
    }catch (IOException e){
      System.out.println("ファイルの書き込み失敗です");
    }finally {  // ファイルを閉じるためのfinallyブロック
      // close()がエラーをすることが有るので更に例が処理を記述
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e2) {
          // 失敗しても何もできないのでブロックはからにしておく
        }
      }
    }
  }
}
