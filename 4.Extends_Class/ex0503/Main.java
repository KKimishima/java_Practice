import  java.util.*;
import  java.util.InputMismatchException;

public class Main {
  public static void main(String args[]) {
    
    System.out.println("口座入力を開始します");
    // 講座入力
    System.out.println("講座番号を入力してください");
    System.out.print("講座番号:");
    try {
      String inputNo = new Scanner(System.in).nextLine();
      if(!inputNo.matches("[0-9]{4}-[0-9]{2}")){
        System.out.println("講座番号が間違っています\n再度実行してください");
        System.exit(1);
      } 
      // 講座種別入力
      System.out.println("口座種別を入力してください");
      System.out.print("普通0,当座1,定期2 :");
      String putAcc = new Scanner(System.in).nextLine();
      if(!putAcc.matches("[0-2]{1}")){
        System.out.println("口座種別が間違っています\n再度実行してください");
        System.exit(1);
      }
      Account ac = new Account(inputNo,Integer.parseInt(putAcc));
    } catch (InputMismatchException e) {
      System.out.println("読み取れない数値です");
    }
  }
}
