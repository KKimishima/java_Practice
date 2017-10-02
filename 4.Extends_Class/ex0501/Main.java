// 型が無いとめちゃくちゃ
class Main {
  public static void main(String args[]) {
    Object s = "型の無いオブジェクト";
    s = new Test1();
    Object n = 1;
    Test2(s,n);
  }
}

class Test2(Object a,Object b){
  for (int i =0;i < (Integer)b;i++) {
    System.out.println(a);
  }
}

class Test1(){
  public String   name;
}
