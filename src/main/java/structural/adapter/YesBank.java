package structural.adapter;

public class YesBank {
    public float balance(String userBankAccountId){
        return 100f;
    }

    public char updateBankaAccount(BankAccountDetails bankAccountDetails){
        return 'Y';
    }

    public char pay(BankAccountDetails fromuser, BankAccountDetails touser, double amount){
        return 'Y';
    }
}
