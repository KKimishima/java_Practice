import  java.time.*;
import  java.util.Date;

class Main {
  public static void main(String args[]) {
    //Date now = new date();
    // Instantの生成(瞬間)
    Instant i1 = Instant.now(); //現在時間を習得
    System.out.println("現在時  :" + i1);
    
    // Instantとlong値と相互変換
    Instant i2 = Instant.ofEpochMilli(31920291332L);
    long  l = i2.toEpochMilli();
    System.out.println("Instantとlong値と相互変換 :" + i2);

    //ZoneDateTimeの変換 
    ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2014,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
    System.out.println("現在時間 :" + z1);
    System.out.println("現在時間 :" + z2);
  }
}
