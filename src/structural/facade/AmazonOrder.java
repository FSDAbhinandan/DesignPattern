package structural.facade;

/**
 * AmazonOrder class that uses the AmazonOrderFacad to place an order.
 * This class serves as a client that interacts with the facade to perform
 * the complete order placement process.
 *
 * It demonstrate that facade pattern used when we need to simplify the complex look of main class.
 * In this condition we should create an helper class like AmazonOrderFacad which can take all complexity of main class.
 */
public class AmazonOrder {

    private static AmazonOrderFacad amazonOrderFacade;

    public static void main(String[] args) {
        amazonOrderFacade = new AmazonOrderFacad();
        amazonOrderFacade.placeOrder(
            "Order details for Amazon",
            150.75,
            "123 Amazon St, Seattle, WA",
            "Tracking details for Amazon order",
            "Notification details for Amazon order",
            "AMZ123456789"
        );
    }
}
