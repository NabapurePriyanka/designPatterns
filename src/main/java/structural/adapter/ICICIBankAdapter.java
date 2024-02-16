package structural.adapter;

public class ICICIBankAdapter implements BankAPIAdapter{

    private ICICIBank iCICIBank;

    public ICICIBankAdapter() {
        iCICIBank = new ICICIBank();
    }

    @Override
    public int getBalance(String userBankAccountId) {
        // Business logic to fetch userBankAccountid
        return (int) iCICIBank.checkBalance("userBankAccountId");

    }

    @Override
    public boolean addBankAccount(String userName, String bankAccountNumber) {
        char status =  iCICIBank.addBankaAccount(userName, bankAccountNumber);
        if(status == 'Y'){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean transferAmount(String fromUsername, String toUsername, int amount) {
        return false;
    }
}
