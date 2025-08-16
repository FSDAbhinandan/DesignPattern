package creational.factory.example1;

import creational.factory.example1.factories.DataBaseFactory;

public interface DataBase {
    void connect();
    void refresh();
    DataBaseFactory getDataBaseFactory();
}
