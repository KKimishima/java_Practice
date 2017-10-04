public class Main {
  public static void main(String[] args) {
    FuncList fl = new FuncList();
    Func1 f1 = FuncList::isOdd;
    Func2 f2 = FuncList::addNamePefix;
    System.out.println(f1.call(15));
    System.out.println(f2.call(true,"スミス"));
    // ラムダ式で表現
    Func1 f3 = x -> x %2 == 1;
    Func2 f4 = (x,y) -> (x ? "男":"女") + y;
    System.out.println(f3.call(15));
    System.out.println(f4.call(true,"たろう"));
  }
}
