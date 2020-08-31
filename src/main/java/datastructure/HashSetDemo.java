package datastructure;

import java.io.IOException;
import java.sql.*;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */

    public static void main(String[] args) throws IOException, SQLException {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("human");
        hashSet.add("monkey");
        hashSet.add("donkey");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("human"));

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        String username = "b2002user2";
        String password = "b2002user2";
        //need a url to connet, databae have a api to connct, we use host is local in port 5432
        //protocol  as https, port as 443

        //String url ="jdbc:postgresql://host:port/database"
        String url = "jdbc:postgresql://localhost:5432/mydbs";
        String query ="INSERT INTO mytable1(hashSet) values('human', 'monkey', donkey')";
       //how to insert from HASHSET?????


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
            System.out.println(resultSet.getString("hashSet"));
        }

    }
}
