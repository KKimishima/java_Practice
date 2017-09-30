public class Hero{
  private int hp,mp;
  private String name;

  public Hero(int a,int b,String c){
    this.hp = a;
    this.mp = b;
    this.name = c;
  }

  public int getHp(){return this.hp;}
  public int getMp(){return this.mp;}
  public String getName(){return this.name;}
}
