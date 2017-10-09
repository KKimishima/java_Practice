import java.io.FileWriter;
import java.io.IOException;

// csvにして書き込み
public class Main {
  public static void main(String[] args) {
   String outFile = "/Volumes/data/Repo/java_Practice/10.FileFormat/ex1001/test.csv";
   FileWriter outSteam = null;
    try {
      outSteam = new FileWriter(outFile,true);
      outSteam.write("テスト1,");
      outSteam.write("テスト2,");
      outSteam.write("テスト3");
      outSteam.write("テスト4,");
      outSteam.write("テスト5,");
      outSteam.write("テスト6");
      outSteam.flush();
      outSteam.close();
    }catch (IOException e) {
      System.out.println("ファイル書き出し失敗");
      try{
        if (outSteam == null){
          outSteam.close();
        }
      }catch (IOException ee){}
    }
    System.out.println("書き出し成功");
  }
}
