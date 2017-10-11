import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// ServerSokectを使ってサーバーを創る
public class Main {
  public static void main(String[] args) {
    System.out.println("ソケットサーバ起動");
    try{
      // ソケットインスタンスと待受ポート
      ServerSocket svSo = new ServerSocket(39648);
      // 反応を待つ
      Socket  so = svSo.accept();
      // 表示
      System.out.println(so.getInetAddress() + "からの接続");
      // 相手に返す文字
      so.getOutputStream().write("Welcome".getBytes());
      so.getOutputStream().flush();
      so.close();

    }catch (IOException e){
      System.out.println("サーバ起動エラー");
    }
  }
}
