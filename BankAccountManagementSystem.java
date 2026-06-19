import java.util.Scanner;

public class BankAccountManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double balance = 0;
        int choice;

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        do {
            System.out.println("\n--- BANK ACCOUNT MANAGEMENT ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit Successful!");
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful!");
                    }
                    break;

                case 3:
                    System.out.println("Account Holder: " + name);
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
