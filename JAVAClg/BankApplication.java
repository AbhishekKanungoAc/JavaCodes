package JAVAClg;
import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public Account(String accountHolderName, String accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}

public class BankApplication {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                   System.out.println();
                   openAccount();
                    break;
                case 2:
                    System.out.println();
                    closeAccount();
                    break;
                case 3:
                    System.out.println();
                    displayPersonalAccount();
                    break;
                case 4:
                    System.out.println();
                    displayAllAccounts();
                    break;
                case 5:
                    System.out.println();
                    checkAccountBalance();
                    break;
                case 6:
                    System.out.println();
                    depositAmount();
                    break;
                case 7:
                    System.out.println();
                    withdrawAmount();
                    break;
                case 8:
                    System.out.println("Closing application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }

    private static void showMenu() {
        System.out.println("\n--- Bank Menu ---");
        System.out.println("1. Open Account");
        System.out.println("2. Close Account");
        System.out.println("3. Display Personal Account");
        System.out.println("4. Display All Accounts");
        System.out.println("5. Check Account Balance");
        System.out.println("6. Deposit Amount");
        System.out.println("7. Withdraw Amount");
        System.out.println("8. Close Application");
        System.out.print("Enter your choice: ");
    }

    private static void openAccount() {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine(); 

        Account newAccount = new Account(name, accountNumber, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account opened successfully.");
    }

    private static void closeAccount() {
        System.out.print("Enter account number to close: ");
        String accountNumber = scanner.nextLine();
        Account accountToRemove = null;

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accountToRemove = account;
                break;
            }
        }

        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void displayPersonalAccount() {
        System.out.print("Enter account number to display: ");
        String accountNumber = scanner.nextLine();

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account Holder: " + account.getAccountHolderName());
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Balance: $" + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (Account account : accounts) {
                System.out.println("Account Holder: " + account.getAccountHolderName());
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Balance: $" + account.getBalance());
                System.out.println("-------------------");
            }
        }
    }

    private static void checkAccountBalance() {
        System.out.print("Enter account number to check balance: ");
        String accountNumber = scanner.nextLine();

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Balance: $" + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void depositAmount() {
        System.out.print("Enter account number to deposit into: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void withdrawAmount() {
        System.out.print("Enter account number to withdraw from: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }
}