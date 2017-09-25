package Kimishima;

public class Result extends Hero{
  private int point;

  public Result(String name,int point){
    super(name);
    this.point = point;
  }
  public int getPoint(){return this.point;}
}
