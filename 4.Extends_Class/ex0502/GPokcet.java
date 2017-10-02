// ジェネリクスを私用したクラス
public class GPokcet<E>{
  // 仮引数を伴うクラスの宣言
  private E data;
  public void put(E d){
    this.data = d;
  }
  public E get(){
    return this.data;
  }
}
