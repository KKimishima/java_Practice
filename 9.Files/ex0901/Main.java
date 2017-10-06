import java.io.*;

// ファイルの読み書き
public class Main {
  public static void main(String arg[]) throws IOException {
    // 書き込み
    // 書き込みパス指定
    String path = "/Volumes/data/Repo/java_Practice/9.Files/ex0901/test.txt";
    // 書き込みファイルObject作製
    FileWriter fw = new FileWriter(path,true);
    // 文字の流し込み
    fw.write("書き込みテスト");
    // 内容の強制
    fw.flush();
    // 書き込み
    fw.close();

    // ファイルの読み込み
    // 読み込みObject作製
    FileReader fr = new FileReader(path);
    System.out.println("ファイルの内容を読み込みます");
    // 一文字ずつ読み込み
    int i = fr.read();
    // 読み込む文字が無いと-1を返す
    while (i != -1){

      char  c = (char) i;
      System.out.print(c);
      // 一文字進める
      i = fr.read();
    }
    System.out.println("");
    System.out.println("ファイルの最後まで行きました");
    // ファイルを閉じる
    fr.close();
  }
}