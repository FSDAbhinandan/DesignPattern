package creational.factory.example1;

public class MongoDBTransaction implements Transaction {

    private String transactionType;

    public MongoDBTransaction(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public void commit() {
        System.out.println("Committing MongoDB transaction of type: " + transactionType);
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back MongoDB transaction of type: " + transactionType);
    }

    @Override
    public String getTransactionType() {
        return null;
    }
}
