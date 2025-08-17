package structural.adapter.adapterImp;

import structural.adapter.adapters.BankAdapter;
import structural.adapter.thirdpartyapis.ICICIBank;

public class ICICIBankAdapter implements BankAdapter {

    private ICICIBank iciciBank = new ICICIBank();
    @Override
    public void deposit(double amount) {
      iciciBank.sendMoney(amount);
    }

    @Override
    public void withdraw(double amount) {
        iciciBank.receiveMoney(amount);
    }

    @Override
    public double getBalance() {
        return iciciBank.checkBalance(); // Placeholder return value
    }

    @Override
    public String getBankName() {
        return "ICICI Bank"; // Return the name of the bank
    }
}
