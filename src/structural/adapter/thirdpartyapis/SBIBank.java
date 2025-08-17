package structural.adapter.thirdpartyapis;

public class SBIBank {
    public void makePayment(double amount) {
        // Logic to send money
        System.out.println("Sending " + amount + " from SBI Bank");
    }

    public void receivePayment(double amount) {
        // Logic to receive money
        System.out.println("Receiving " + amount + " in SBI Bank");
    }

    public double checkBalance() {
        // Logic to check balance
        System.out.println("Checking balance in SBI Bank");
        return 2000.0; // Placeholder balance
    }
}
