// Genericsを使わないでなんでも収納できるクラスを創る
public class Pokcet{
  private Object  data;
  // 各変数を収納
  public void  put(Object d){
    this.data = d;
  }
  // 変数を吐きだす
  public Object get(){
    return this.data;
  }
}
