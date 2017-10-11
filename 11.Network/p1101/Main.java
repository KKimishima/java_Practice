// うまくいかない
import java.io.*;
import java.net.Socket;

// ファビコンを習得
public class Main {
  public static void main(String[] args) {
    //String ul = "dokojava.ja";
    String outPath = "/Volumes/data/Repo/java_Practice/11.Network/p1101/";
    String file = "dj.ico";
    try{
      // ソケットインスタンス作製
      Socket so = new Socket("dokojava.jp",80);

      // 入力用と出力ストリームをソケットに設定
      InputStream  sInSt = so.getInputStream();
      OutputStream sOutSt = so.getOutputStream();

      // HTTP要求を送信
      sOutSt.write("GET /favicon.ico HTTP/1.0\r\n".getBytes());
      sOutSt.write("\r\n".getBytes());
      sOutSt.flush();

      // 出力用インスタンス
      // 要求ストリームインスタンス
      //InputStreamReader inStRe = new InputStreamReader(sInSt);

      // ファイル出力ストリームインスタンス
      FileOutputStream fiOutSt = new FileOutputStream(outPath + file);

      // 出力バッファストリーム
      //BufferedOutputStream bufItSt = new BufferedOutputStream(fiOutSt);

      // 書き出すストリーム
      //OutputStreamWriter outPutStWr = new OutputStreamWriter(bufItSt);


      int i = sInSt.read();
      // 最初の通信メッセージが入れるため
      // バイナリがおかしくなる
      while (i != -1){
        System.out.print((char)i);
        fiOutSt.write((byte)i);
        //outPutStWr.write((byte)i);
        i = sInSt.read();
      }

      // ファイルのクローズ
      fiOutSt.flush();
      fiOutSt.close();
      //outPutStWr.flush();
      //outPutStWr.close();
      sInSt.close();

    }catch (IOException e ){
      System.out.println("処理失敗");
    }
  }
}
