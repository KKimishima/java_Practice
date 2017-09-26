public class Account{
  private String  accoutNo;   // 口座番号
  private String  accoutType; // 口座種別
  private int     balance;    // 残高

  // コンストラクタ
  public Account(String accoutNo,String accoutTypeinte){
    // a-z A-Z _ ¥di 0-9 ¥s 空文字
    if(accoutNo.matches("[0-9]{4}-[0-9]{2}")){
    //if(accoutNo.matches("[-]")){
      System.out.println("該当");
    } else{
      System.out.println("該当なし");
    }
    this.accoutNo   = accoutNo;
    this.accoutType = accoutType;
  }

}
