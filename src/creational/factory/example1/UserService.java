package creational.factory.example1;

import creational.factory.example1.db.MongoDb;
import creational.factory.example1.db.MySqlDB;
import creational.factory.example1.factories.DataBaseFactory;
import creational.factory.example1.queries.Query;

public class UserService {
    public static void main(String[] args) {
        DataBase dataBase =new MySqlDB();
        DataBaseFactory dataBaseFactory = dataBase.getDataBaseFactory();
        Query query = dataBaseFactory.createQuery("SELECT * FROM users");
        System.out.println(query.getQueryString().toString());
        System.out.println(query.toString());
        query.execute();
    }

}
