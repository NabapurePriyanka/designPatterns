package structural.adapter;

public interface BankAPIAdapter {
    public int getBalance(String userBankAccountId);

    public boolean addBankAccount(String userName, String bankAccountNumber);

    public boolean transferAmount(String fromUsername, String toUsername, int amount);
}
