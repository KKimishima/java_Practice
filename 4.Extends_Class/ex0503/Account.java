public class Account{
  private String  accoutNo;   // 口座番号
  private int  accoutType; // 口座種別
  private int     balance;    // 残高

  // コンストラクタ
  public Account(String accoutNo,int accoutTypeinte){
    // a-z A-Z _ ¥di 0-9 ¥s 空文字
    this.accoutNo   = accoutNo;
    this.accoutType = accoutType;
  }
}
