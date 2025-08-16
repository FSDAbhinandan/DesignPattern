package creational.factory.example1.db;

import creational.factory.example1.DataBase;
import creational.factory.example1.factories.DataBaseFactory;
import creational.factory.example1.factories.factoryimplementation.MongoDBFactory;

public class MongoDb implements DataBase {

    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB database...");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing MongoDB database...");
    }

    @Override
    public DataBaseFactory getDataBaseFactory() {
        return new MongoDBFactory();
    }
}
