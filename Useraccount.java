import java.util.Scanner;
 class Useraccount{
    private double balance;
    public Useraccount(double intialbalance)
    {
        this.balance=intialbalance;//intilizaing the balance
    }
    public double getBalance()
    {
        return balance;
    }
    public void depoist(double amount)
    {
        if(amount>0)
        {
            balance+=amount;//the amount is added to balance
            System.out.println("Successfully depoisted: Rs."+ amount);
        }
        else{
            System.out.println("Transcation failed!!");2
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;// thye amount is credited into the account
            System.out.println("Successfully withdrew: Rs." + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            System.out.println("Please enter the sufficient amount to withdraw!!");
            return false;
        }
    }
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
    class ATM {
        private BankAccount account;
    
        public ATM(BankAccount account) {
            this.account = account;
        }
    
        public void start() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thanking you!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

}