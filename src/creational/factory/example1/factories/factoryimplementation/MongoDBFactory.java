package creational.factory.example1.factories.factoryimplementation;

import creational.factory.example1.queries.queryImplementation.MongoDBQuery;
import creational.factory.example1.MongoDBTransaction;
import creational.factory.example1.queries.Query;
import creational.factory.example1.Transaction;
import creational.factory.example1.factories.DataBaseFactory;

public class MongoDBFactory implements DataBaseFactory {

    @Override
    public Query createQuery(String query) {
        return new MongoDBQuery(query);
    }

    @Override
    public Transaction createTransaction(String transactionType) {
        return new MongoDBTransaction(transactionType);
    }
}
