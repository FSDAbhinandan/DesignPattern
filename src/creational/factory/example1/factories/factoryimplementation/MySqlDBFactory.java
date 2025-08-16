package creational.factory.example1.factories.factoryimplementation;

import creational.factory.example1.queries.queryImplementation.MySqlQuery;
import creational.factory.example1.MySqlTransaction;
import creational.factory.example1.queries.Query;
import creational.factory.example1.Transaction;
import creational.factory.example1.factories.DataBaseFactory;

public class MySqlDBFactory implements DataBaseFactory {

    @Override
    public Query createQuery(String query) {
        return new MySqlQuery(query);
    }

    @Override
    public Transaction createTransaction(String transactionType) {
        return new MySqlTransaction(transactionType);
    }
}
