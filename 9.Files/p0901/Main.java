import java.io.FileInputStream;
import java.io.FileOutputStream;

// FileInputStream,FileOutStreamクラスを使って.ファイルを指定して
public class Main {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("/Volumes/data/Repo/java_Practice/9.Files/ex0902/test.txt");
    FileOutputStream out = new FileOutputStream("/Volumes/data/Repo/java_Practice/9.Files/p0901/test.txt");
    // 文字とし読み込み
    int i = in.read();
    // 最後まで読み込み
    while (i != -1){
      out.write(i);
      // 一つ進める
      i = in.read();
    }
    out.flush();
    out.close();
    in.close();
  }
}
