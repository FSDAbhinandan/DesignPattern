package creational.factory.example1.queries.queryImplementation;

import creational.factory.example1.queries.Query;

public class MongoDBQuery implements Query {

    private String query;

    public MongoDBQuery(String query) {
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executing MongoDB query: " + query);
    }

    @Override
    public String getQueryString() {
        return query;
    }

    @Override
    public String toString() {
        return "MongoDBQuery{" +
                "query='" + query + '\'' +
                '}';
    }
}
