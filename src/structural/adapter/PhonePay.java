package structural.adapter;

import structural.adapter.adapterImp.ICICIBankAdapter;
import structural.adapter.adapterImp.SBIBankAdapter;
import structural.adapter.adapters.BankAdapter;

public class PhonePay {
    public static void main(String[] args) {
        BankAdapter iciciBankAdapter = new SBIBankAdapter();

        // Deposit money
        iciciBankAdapter.deposit(1000.0);

        // Withdraw money
        iciciBankAdapter.withdraw(500.0);

        // Check balance
        double balance = iciciBankAdapter.getBalance();
        System.out.println( iciciBankAdapter.getBankName());
    }
}
