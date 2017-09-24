import java.util.Date;

class Main {
  public static void main(String args[]) {
    Date now = new Date();
    System.out.println("Dateを直接表示"+ now);
    System.out.println("Dateをlong型のエポックに変換"+ now.getTime());
    Date past = new Date(now.getTime());
    System.out.println("エポックからdate型に変換" + past);
  }
};

