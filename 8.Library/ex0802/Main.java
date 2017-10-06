import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.*;

public class Main {
  public static void main(String[] args) {
    String s1 = StringUtils.trim("空白なし");
    String s2 = StringUtils.trim("  空白あり   ");

    System.out.println("結果:" +s1 + "桁数" + s1.length());
    System.out.println("結果:" +s2 + "桁数" + s1.length());
    Log looger = LogFactory.getLog(Main.class) ;
    if(args.length != 2){
      looger.error("起動引き数が異常です" + args.length);
    }

  }
}
