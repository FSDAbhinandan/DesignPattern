package structural.adapter.adapters;

public interface BankAdapter {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getBankName();
}
