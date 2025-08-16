package creational.factory.example1.factories;

import creational.factory.example1.queries.Query;
import creational.factory.example1.Transaction;

public interface DataBaseFactory {

    Query createQuery(String query);
    Transaction createTransaction(String transactionType);
}
