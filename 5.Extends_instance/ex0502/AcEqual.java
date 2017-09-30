import Type.*;

public class AcEqual extends Account{
  //Objectクラスのequalsメソッドのオーバライド
  //独自の比較方法に書き換え
  public AcEqual(String n,String na,Type t,int v){
    super(n,na,t,v);
  }  
  @Override
  public boolean equals(Object o){
    //自分自信が引き数渡された場合,無条件でtrueを返す
    if(o == super){return true;} 
    //nullが引数として渡された場合,falseを返す
    if(o == null){return false;}
    //比較し型ががことな場合,falseを返す
    if(!(o instanceof AcEqual)){return false;}

  }
}
