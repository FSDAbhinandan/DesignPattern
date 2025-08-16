package creational.factory.example1;

public class MySqlTransaction implements Transaction {

    private String transactionId;

    public MySqlTransaction(String transactionId) {
        this.transactionId = transactionId;
    }
    @Override
    public void commit() {
        System.out.println("Committing MySQL transaction with ID: " + transactionId);
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back MySQL transaction with ID: " + transactionId);
    }

    @Override
    public String getTransactionType() {
        return null;
    }
}
