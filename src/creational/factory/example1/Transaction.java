package creational.factory.example1;

public interface Transaction {
    void commit();
    void rollback();
    String getTransactionType();
}
