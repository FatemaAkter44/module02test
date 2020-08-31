package db.dbconsumer;

import java.sql.*;

public class CompareTwoDatabaseTable {

    /**
     *
     * Create method to compare two database table.
     * As an example you can prepare two database and similar two tables with 20 records
     * Later get the records using Java and compare two
     * Later use unit testing framework to test in under test
     *
     * */
    public static void connetWithDB() throws SQLException {
        String username = "postgres";
        String password = "1518";
        //need a url to connet, databae have a api to connct, we use host is local in port 5432
        //protocol  as https, port as 443

        //String url ="jdbc:postgresql://host:port/database"
        String url = "jdbc:postgresql://localhost:5432/dvdrental";
        String query ="SELECT first_name FROM public.actor limit 20";

        //we need a jar file to work with Sql and database as we used for testing , we added dependecieds in to pom file
        //1st create connection object
        Connection connection = DriverManager.getConnection(url, username, password);
        //we need to prepare our query now. so i create a statement object.
        //2nd create statement object
        Statement statement = connection.createStatement();
        // by statemnet object execute the query
        // statement.executeQuery(query); //this like click enter button
        ResultSet resultSet = statement.executeQuery(query);

        //now process the result
        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name"));
        }
    }


}
