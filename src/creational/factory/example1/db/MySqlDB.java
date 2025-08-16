package creational.factory.example1.db;

import creational.factory.example1.DataBase;
import creational.factory.example1.factories.DataBaseFactory;
import creational.factory.example1.factories.factoryimplementation.MySqlDBFactory;

public class MySqlDB implements DataBase {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing MySQL database...");
    }

    @Override
    public DataBaseFactory getDataBaseFactory() {
        return new MySqlDBFactory();
    }
}
