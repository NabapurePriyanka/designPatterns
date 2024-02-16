package structural.adapter;

public class YesBankAdapter implements BankAPIAdapter{
    @Override
    public int getBalance(String userBankAccountId) {
        return 0;
    }

    @Override
    public boolean addBankAccount(String userName, String bankAccountNumber) {
        return false;
    }

    @Override
    public boolean transferAmount(String fromUsername, String toUsername, int amount) {
        return false;
    }
}
