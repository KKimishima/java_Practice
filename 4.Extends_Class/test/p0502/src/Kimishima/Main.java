package Kimishima;
public class Main {
  public static void main(String args[]) {
    StrongBox box = new StrongBox(KeyType.DIAL);
    box.put(KeyType.PADLOCK);
    box.put("ジェネリクス代入");
    System.out.println("結果"+ box.get());
  }
}

