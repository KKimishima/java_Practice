import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

// ファビコン取得
public class Main {
  public static void main(String[] args) throws Exception {
    URL url = new URL("http://dokojava.jp/favicon.ico");
    InputStream inSt = url.openStream();
    OutputStream outSt = new FileOutputStream("/Volumes/data/Repo/java_Practice/11.Network/p11011/dj.ico");
    int i = inSt.read();
   while (i != -1){
      outSt.write((byte)i);
      i = inSt.read();
    }
    outSt.flush();
    outSt.close();
    inSt.close();
  }
}
