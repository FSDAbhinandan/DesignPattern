package creational.factory.example1.queries.queryImplementation;

import creational.factory.example1.queries.Query;

public class MySqlQuery implements Query {
    private String query;

    public MySqlQuery(String query) {
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executing MySQL query: " + query);
    }

    @Override
    public String getQueryString() {
        return query;
    }

    @Override
    public String toString() {
        return "MySqlQuery{" +
                "query='" + query + '\'' +
                '}';
    }
}
