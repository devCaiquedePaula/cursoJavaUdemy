package cursoJavaCompleto.ProgOrientadaObjetos.application;

import cursoJavaCompleto.ProgOrientadaObjetos.entities.AccountExercise;

import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AccountExercise account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);

        if (initialDeposit == 'y' || initialDeposit == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            account = new AccountExercise(accountNumber, accountHolder, initialDepositValue);
        } else {
            account = new AccountExercise(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println("------------------------------");
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println("------------------------------");
        System.out.print("Enter a withdrawal value: ");
        double withdrawalValue = sc.nextDouble();
        account.withdraw(withdrawalValue);
        System.out.println("Updated account data:");
        if (withdrawalValue > account.getBalance()) {
            System.out.println("Withdrawal failed: Insufficient balance.");
        } else {
            System.out.println(account + " - Withdrawal successful - A fee of 5.00 was applied.");
        }

        System.out.println("------------------------------");
        sc.close();
    }
}
