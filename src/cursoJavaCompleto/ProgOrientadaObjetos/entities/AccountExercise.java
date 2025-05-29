package cursoJavaCompleto.ProgOrientadaObjetos.entities;

public class AccountExercise {
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    private static final double WITHDRAWAL_FEE = 5.00;

    // Construtor com depósito inicial
    public AccountExercise(int accountNumber, String accountHolder, double initialSDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialSDeposit);
    }

    // Construtor sem depósito inicial
    public AccountExercise(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.accountHolder = holder;
    }

    // Método para depósito
    public void deposit(double amount){
      balance += amount;
    }

    // Método para saque com taxa de 5.00
    public void withdraw(double amount) {
        balance -= amount + WITHDRAWAL_FEE;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Representação textual da conta
    @Override
    public String toString() {
        return "Account " + accountNumber +
                ", Holder: " + accountHolder +
                ", Balance: $ " + String.format("%.2f", balance);
    }
}
