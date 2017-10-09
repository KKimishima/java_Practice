// ギブ
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Main{
  public static void main(String[] args) {
    try {
      // 0.読み込みObject設定
      String setPath = "/Volumes/data/Repo/java_Practice/10.FileFormat/ex1006/test.xml";
      InputStream is = new FileInputStream(setPath);
      // 1. 読み込みxmlの設定
      Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
      // 2.一番外の要素習得
      Element hero = doc.getDocumentElement();
      // 3.次の要素習得
      Element weapon = findChildByTag(hero,"waepon");
      // 4.その中のpowerを習得
      Element power = findChildBytag(weapon,"power");
      // 5.その中の文字情報習得
      String value = power.getTextContent();

    }catch (IOException e){
      System.out.println("ファイル処理失敗");
    }catch (ParserConfigurationException e3){
      System.out.println(e3);
    }catch (SAXException e3){

    }

  }
}