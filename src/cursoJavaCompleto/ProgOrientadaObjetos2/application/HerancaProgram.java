package cursoJavaCompleto.ProgOrientadaObjetos2.application;

import cursoJavaCompleto.ProgOrientadaObjetos2.entities.Account;
import cursoJavaCompleto.ProgOrientadaObjetos2.entities.BusinessAccount;
import cursoJavaCompleto.ProgOrientadaObjetos2.entities.SavingsAccount;

public class HerancaProgram {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println("Account balance after withdrawal: " + acc.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println("Savings Account balance after withdrawal: " + acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println("Business Account balance after withdrawal: " + acc3.getBalance());
    }
}
