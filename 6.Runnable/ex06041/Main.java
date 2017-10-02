// ラムダ式の省略
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    // 基本型
    IntToDoubleFunction func1 = (int x) -> {return x*x*3.14;};
    double a = func1.applyAsDouble(5);
    System.out.println("基本型ラムダ式 = "+ a);
    // 代入時の型の省略できる
    IntToDoubleFunction func2 = (x) -> {return x*x*3.14;};
    double b = func2.applyAsDouble(5);
    System.out.println("型の省略 = " + b);
    // 丸括弧の省略ができる
    IntToDoubleFunction func3 = x -> {return x * x * 3.14;};
    double c = func3.applyAsDouble(5);
    System.out.println("丸括弧の省略 = " + c);
    // ラムダ式が単一のreturnなら,ブロックとreturnを省略できる
    IntToDoubleFunction func4 = x -> x * x * 3.14;
    double d = func3.applyAsDouble(5);
    System.out.println("ブロック,returnの省略 = " + d);
    // ブロック外部のクラスにアクセス
    // ただし,外部変数はラムダ式の中で書き換えることはできない
    double e = 3.14;
    IntToDoubleFunction func5 = x -> x * x * e;
    double f = func3.applyAsDouble(5);
    System.out.println("ブロック外にアクセス = " + f );
  }

}
