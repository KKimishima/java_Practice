import  java.util.Date;
import  java.util.Calendar;
import  java.text.SimpleDateFormat;

class Main {
  public static void main(String args[]) {
    // 1.時間の習得
    Date now = new Date();
    System.out.println("1.時間の習得  :" + now);
    Calendar c = Calendar.getInstance();
    // 2.習得した日時情報をCalendarにセット
    c.setTime(now);
    // 3.日にちの数値を習得
    int day = c.get(Calendar.DAY_OF_MONTH);
    System.out.println("3.日にちの数値を習得  :" + day);
    // 4.取得した値に100を足してCalendarに設置
    day += 100;
    c.set(Calendar.DAY_OF_MONTH,day);
    System.out.println("4.取得した値に100を足してCalendarに設置" + c.get(Calendar.DAY_OF_MONTH));
    // 5.Calendarの日付情報をdate型に変換
    Date chday = c.getTime();
    // 6.SimpleDateDormatを用いて、指定された形式でDateインタンスの内容を表示
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd月");
    System.out.println(f.format(chday));
  }
}
