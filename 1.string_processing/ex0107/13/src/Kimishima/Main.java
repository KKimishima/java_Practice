package Kimishima;

class Main {
  public static void main(String args[]) {
    String[] s = new String[4];
    s[0] = "aaaaaasd";
    s[1] = "A11";
    s[2] = "A1";
    s[3] = "UASD";

    System.out.println("一問目:" + s[0].matches(".*"));
    System.out.println("二問目:" + s[1].matches("A¥d{1,2}"));
    System.out.println("二問目:" + s[2].matches("A¥d{1,2}"));
    System.out.println("三問目:" + s[3].matches("U[A-Z]{3}"));

  }
}
