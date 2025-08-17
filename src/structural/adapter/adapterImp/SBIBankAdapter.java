package structural.adapter.adapterImp;

import structural.adapter.adapters.BankAdapter;
import structural.adapter.thirdpartyapis.SBIBank;

public class SBIBankAdapter implements BankAdapter {

    SBIBank sbiBank = new SBIBank();
    @Override
    public void deposit(double amount) {
        sbiBank.makePayment(amount);
    }

    @Override
    public void withdraw(double amount) {
        sbiBank.receivePayment(amount);
    }

    @Override
    public double getBalance() {
        return sbiBank.checkBalance();
    }

    @Override
    public String getBankName() {
        return "State Bank Of India";
    }
}
