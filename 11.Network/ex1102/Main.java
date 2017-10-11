import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

// Socket通信
/*  TCP/IPのプロトコル
    1.クライアントからサーバへ接続申請
    2.サーバーからクライントへの接続許可申請
    3.セッションの確立
 */
public class Main {
  public static void main(String[] args) {

    Socket s1 = null;
    try {
      // IPまたわサーバ名とポート番号を指定して
      // Socketインスタンスを生み出す
      s1 = new Socket("www.acroquest.co.jp",80);

      // Socketから入力ストリームと出力ストリームを習得
      InputStream  inSt = s1.getInputStream();
      OutputStream outSt = s1.getOutputStream();

      //HTTP要求を送信
      outSt.write("GET /index.html HTTP/1.0\r\n".getBytes());
      outSt.write("\r\n".getBytes());
      outSt.flush();

      // 要求用のストリーム
      InputStreamReader inStR = new InputStreamReader(inSt);

      // 要求を受信
      int i = inStR.read();
      while (i != -1){
        System.out.print((char)i);
        i = inStR.read();
      }
      s1.close();

    }catch (IOException e){
      System.out.println("ソケット通信失敗");
      e.printStackTrace();
      try{
        if(s1 != null){
          s1.close();
        }
      }catch (IOException ee){}
    }finally {
    }

  }
}
