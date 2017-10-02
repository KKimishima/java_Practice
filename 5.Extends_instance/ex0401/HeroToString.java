public class HeroToString extends Hero{
  public HeroToString(int a,int b,String c){
    super(a,b,c);
  }
  // そのまま分かりにくいのでオーバーライドしておく
  @Override
  public String toString(){
    return "Hero(name:" + super.getName() +
            "/HP:" + super.getHp() +
            "/MP:" + super.getMp() +
            ")";
  }
}
