import java.util.Scanner;

class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        Account account = new Account("12345", "1234", 1000.0);

        Scanner scanner = new Scanner(System.in);
        String enteredAccountNumber;
        String enteredPin;

        System.out.println("\n*** Welcome to the ATM ***");

        do {
            System.out.print("\nEnter your account number: ");
            enteredAccountNumber = scanner.next();
            System.out.print("\nEnter your PIN: ");
            enteredPin = scanner.next();

            if (account.getAccountNumber().equals(enteredAccountNumber) && account.validatePin(enteredPin)) {
                break;
            } else {
                System.out.println("Invalid account number or PIN. Please try again.");
            }
        } while (true);

        System.out.println("\nLogin successful\n");
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
			System.out.println("------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful.\n");
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("\nThank you for using the ATM...");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
