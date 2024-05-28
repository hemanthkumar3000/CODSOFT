public class ATMSystem {
    public static void main(String[] args) {
        Useraccount account = new Useraccount(1000.0); // Initial balance
        ATM atm = new ATM(account);
        atm.start();
    }
}