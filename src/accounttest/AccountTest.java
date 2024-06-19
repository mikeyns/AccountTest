package accounttest;

public class AccountTest {
    private String name;
    private double balance;

    public AccountTest(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Erro: Valor de retirada negativo.");
        } else if (balance - amount < 0) {
            System.out.println("Aviso: Saldo insuficiente para fazer a retirada.");
        } else {
            balance -= amount;
            System.out.println("Retirada de " + amount + " realizada com sucesso.");
            System.out.println("Novo saldo: " + balance);
        }
    }

    public static void main(String[] args) {
        AccountTest account = new AccountTest("Teste", 100.0);
        account.withdraw(50.0);
    }
}
