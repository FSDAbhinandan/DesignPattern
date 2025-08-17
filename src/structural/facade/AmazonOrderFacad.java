package structural.facade;

public class AmazonOrderFacad {

    private AmazonOrder amazonOrder;
    private AmazonPayment amazonPayment;
    private AmazonShipping amazonShipping;
    private AmazonNotification amazonNotification;
    private AmazonTracking amazonTracking;

    public AmazonOrderFacad() {
        this.amazonPayment = new AmazonPayment();
        this.amazonShipping = new AmazonShipping();
        this.amazonNotification = new AmazonNotification();
        this.amazonTracking = new AmazonTracking();
    }

    public void placeOrder(String orderDetails, double amount, String shippingAddress, String trackingDetails, String notificationDetails, String orderId) {

        amazonPayment.processPayment(orderId,amount);
        amazonShipping.shipOrder(shippingAddress);
        amazonNotification.sendNotification(notificationDetails);
        amazonTracking.trackOrder(trackingDetails);
    }
}
