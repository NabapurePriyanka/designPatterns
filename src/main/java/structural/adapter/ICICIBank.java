package structural.adapter;

public class ICICIBank {
    public float checkBalance(String userBankAccountId){
        return 100f;
    }

    public char addBankaAccount(String userName, String accountNumber){
        return 'Y';
    }

    public double pay(String fromuserid, String touserid, int amount){
        return 1;
    }
}
