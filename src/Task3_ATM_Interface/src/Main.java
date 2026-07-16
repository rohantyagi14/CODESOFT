public class Main {

    public static void main(String[] args) {

        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(5000);

        // Create ATM object
        ATM atm = new ATM(account);

        // Start ATM
        atm.start();
    }
}