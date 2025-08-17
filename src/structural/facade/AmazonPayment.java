package structural.facade;

public class AmazonPayment {
    public void processPayment(String orderId, double amount) {
        System.out.println("Processing payment for Order ID: " + orderId + " with amount: $" + amount);
        // Logic to process payment
    }

    public boolean validatePayment(String orderId) {
        System.out.println("Validating payment for Order ID: " + orderId);
        // Logic to validate payment
        return true; // Assuming validation is successful
    }
}
