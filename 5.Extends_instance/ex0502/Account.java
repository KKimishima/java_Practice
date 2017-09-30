
public class Account{
  private String  no;
  private           
  public Account(String n,String na,Type t,int v){
    this.no= n;
    this.name = na;
  }

  public String getNo(){return this.no;}
  public String getName(){return this.name;}
  public Type getType(){return this.ty;}
  public int getValue(){return this.value;}

  @Override
  public boolean equals(Object o){
    //自分自信が引き数渡された場合,無条件でtrueを返す
    if(o == this){return true;} 
    //nullが引数として渡された場合,falseを返す
    if(o == null){return false;}
    //比較し型ががことな場合,falseを返す
    if(!(o instanceof Account)){return false;}
    //比較できる様に適宜キャストしておく
    Account r = (Account)o;
    君島ki
  }
}
