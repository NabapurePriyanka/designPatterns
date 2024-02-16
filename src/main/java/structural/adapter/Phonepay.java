package structural.adapter;

public class Phonepay {

    private BankAPIAdapter bankAPIAdapter;

    public Phonepay() {
        bankAPIAdapter = new ICICIBankAdapter();
    }

    public void getBalance(){
        int balance = bankAPIAdapter.getBalance("id");
        System.out.println(balance);

    }

    public void addBankAccount() {

    }

    public void transferAmount() {

    }
}
