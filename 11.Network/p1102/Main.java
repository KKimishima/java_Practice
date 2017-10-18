import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

// ソケット通信
public class Main {
  public static void main(String[] args) {
    try{
    Socket so = new Socket("192.168.33.11",39648));
      OutputStream os = so.getOutputStream();

    }catch (IOException e){
      System.out.println("通信失敗");
    }
  }
}
