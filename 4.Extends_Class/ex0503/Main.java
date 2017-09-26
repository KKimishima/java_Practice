import  java.util.*;
//import  java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    System.out.println("講座番号を入力してください");
    String inputNo = new Scanner(System.in).nextLine();
    if(!inputNo.matches("[0-9]{4}-[0-9]{2}")){
      System.out.println("入力値が間違っています\n再度実行してください");
      System.exit(1);
    } 
    String inputAccouTyepe = new Scanner(System.in).nextInt();
    Account ca = new Account(inputNo,"java");

  }
}
