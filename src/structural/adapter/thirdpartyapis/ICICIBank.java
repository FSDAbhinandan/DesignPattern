package structural.adapter.thirdpartyapis;

public class ICICIBank {

    public void sendMoney(double amount) {
        // Logic to send money
        System.out.println("Sending " + amount + " from ICICI Bank");
    }
    public void receiveMoney(double amount) {
        // Logic to receive money
        System.out.println("Receiving " + amount + " in ICICI Bank");
    }
    public double checkBalance() {
        // Logic to check balance
        System.out.println("Checking balance in ICICI Bank");
        return 1000.0; // Placeholder balance
    }
}
