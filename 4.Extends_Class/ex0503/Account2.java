public class Account2 {
    private String  countNo;
    private int     balance;
    private AccountType accountType;

    public Account2(String x,AccountType y){
      this.countNo = x;
      this.accountType =y;
    }

    public String getConutNo(){return this.countNo;}
    public AccountType getAccounntType(){return this.accountType;}
}
