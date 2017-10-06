// ファイル
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Main {
  public static void main(String[] args) {
    // パスのセット
    String inFile = "/Volumes/data/Repo/java_Practice/9.Files/p0901/test.txt";
    String outFile = "/Volumes/data/Repo/java_Practice/9.Files/p0902/test.zip";

    // 読み込みオブジェクの初期化
    FileInputStream inStram = null;
    // zip圧縮用Object初期化
    GZIPOutputStream outGSream = null;

    // 例外処理
    try{
      // 各フィルターの設定
      // インプットのストリーム
      inStram = new FileInputStream(inFile);
      // アウトプットのストリーム
      FileOutputStream outStream = new FileOutputStream(outFile);
      // アウトプットのバッファストリーム
      BufferedOutputStream outBuffSteam = new BufferedOutputStream(outStream);
      // zipのアプトプットのストリーム
      outGSream = new GZIPOutputStream(outBuffSteam);

      // 読み込み
      int i = inStram.read();
      while (i != -1){
        outGSream.write(i);
        i = inStram.read();
      }

      // ファイルのクローズ
      outBuffSteam.flush();
      outGSream.close();
      inStram.close();

     // エラーキャッチ
    }catch (IOException e){
     System.out.println("ファイル読み込みに成功しました");
     try {
       if (inStram != null){
         inStram.close();
       }
       if (outGSream != null){
         outGSream.close();
       }
     }catch (IOException ee){
      // 何もできないが記述
     }
    }
    System.out.println("Fileの書き出し成功");
  }
}
