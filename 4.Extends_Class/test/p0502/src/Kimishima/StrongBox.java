package Kimishima;
import Kimishima.KeyType.*;
public class StrongBox<E>{
  private E item;
  private KeyType key;
  private long count;

  public StrongBox(KeyType k){
    this.key = k;
  }

  public void put(E i){this.item = i;}
  
  public E get(){
    this.count++;
    switch (this.key) {
      case PADLOCK:
        if(this.count < 1024){return null;}break;
      case BUTTON:
        if(this.count < 10000){return null;}break;
      case DIAL:
        if(this.count < 30000){return null;}break;
      case FINGER:
        if(this.count < 30000){return null;}break;
      default:
        System.out.println("エラー発生強制終了");
        System.exit(1);
    }
    this.count = 0;
    return this.item;
  }
}
