
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

// ネットワーク
public class Main {
  public static void main(String[] args) {
    String addless = "http://www.komeda.co.jp";
    String fileout = "/Volumes/data/Repo/java_Practice/11.NetWork/ex1101/index.html";
    InputStream inSt = null;
    OutputStreamWriter outSt = null;
    try {
      // URLクラスをインスタンス化
      URL url = new URL(addless);
      // openStream()を呼び出してデータを取り出すストリームを習得
      inSt  = url.openStream();
      // インプット用のストリームインスタンス
      InputStreamReader inStR = new InputStreamReader(inSt);
      // 出力先のストリーム
      FileOutputStream fileOSt = new FileOutputStream(fileout);
      // 出力をためておくストリーム
      BufferedOutputStream buffO = new BufferedOutputStream(fileOSt);
      // 書き出すストリーム
      outSt = new OutputStreamWriter(buffO);
      int i = inStR.read();
      while (i != -1){
        outSt.write(i);
        i = inStR.read();
      }
      outSt.flush();
      outSt.close();
      inStR.close();
    } catch (MalformedURLException e) {
      System.out.println("URLの習得失敗");
      e.printStackTrace();
    }catch (IOException e2){
      System.out.println("ファイル操作失敗");
      e2.printStackTrace();
      try{
        if(outSt != null){
          outSt.close();
        }
        if(inSt != null){
          inSt.close();
        }
      }catch (IOException e3){}// 何もしないがエラーキャッチ
    }
  }
}