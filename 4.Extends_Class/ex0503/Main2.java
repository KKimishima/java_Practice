public class Main2 {
  public static void main(String args[]) {
    Account2 ac2 = new Account2("12356",AccountType.FUTSU);
    System.out.println("口座番号" + ac2.getConutNo());
    System.out.println("種類" + ac2.getAccounntType());
  }
}
