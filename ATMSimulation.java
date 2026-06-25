import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.00);

        System.out.println("Welcome to the ATM");
        System.out.println("Current Balance: $" + account.getBalance());
        System.out.print("Enter withdrawal amount: $");

        try {
            double amount = Double.parseDouble(scanner.nextLine());
            account.withdraw(amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Final Balance: $" + account.getBalance());
            System.out.println("Thank you for using the ATM.");
            scanner.close();
        }
    }
}
