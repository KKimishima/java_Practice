public class Main {
  public static void main(String args[]) {
    Hero h = new Hero(100,50,"hoge");
    HeroToString hto = new HeroToString(100,50,"hoge");
    System.out.println(h);
    System.out.println(hto);
  }
}
