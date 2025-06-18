import java.util.Scanner;
    public class SimpleBankingSystem {
        static int balance = 0;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String correctPIN = createPIN(scanner);
            int attempts = 0;
            while (attempts < 3) {
                System.out.print("Enter your 4-digit PIN: ");
                String inputPIN = scanner.nextLine();
                if (inputPIN.equals(correctPIN)) {
                    System.out.println("PIN verified successfully.");
                    showMenu(scanner);
                    return;
                } else {
                    attempts++;
                    System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
                }
            }

            System.out.println("Too many incorrect attempts. System locked.");
        }

        public static String createPIN(Scanner scanner) {
            System.out.print("Create a 4-digit PIN: ");
            return scanner.nextLine();
        }

        public static void showMenu(Scanner scanner) {
            int choice;
            do {
                System.out.println("\n--- Banking Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1: deposit(scanner); break;
                    case 2: withdraw(scanner); break;
                    case 3: checkBalance(); break;
                    case 4: System.out.println("Exiting system. Thank you!"); break;
                    default: System.out.println("Invalid choice.");
                }

            } while (choice != 4);
        }

        public static void deposit(Scanner scanner) {
            System.out.print("Enter amount to deposit: ");
            int amount = scanner.nextInt();
            balance += amount;
            System.out.println("Deposited successfully.");
        }

        public static void withdraw(Scanner scanner) {
            System.out.print("Enter amount to withdraw: ");
            int amount = scanner.nextInt();
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }
        public static void checkBalance() {
            System.out.println("Your balance is: " + balance);
        }
    }


