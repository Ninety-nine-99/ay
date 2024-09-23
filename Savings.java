package interfaces;

public class Savings implements IBankAccount, IABCBank {

    @Override
    public void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Close Account");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit is Saving Account");
    }

    @Override
    public void withdraw() {
            System.out.println("Withdraw is saving Account");
    }

    @Override
    public void balance() {
        System.out.println("Balance is saving Account");
    }

    
}
