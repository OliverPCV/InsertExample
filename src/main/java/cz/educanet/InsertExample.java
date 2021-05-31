package cz.educanet;

import java.sql.*;

public class InsertExample {

    public static void main(String artgs[]) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "");

        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO EXAMPLE VALUES(NULL, ?, 'Karel', 'Lorem ipsum', 14400)");
        preparedStatement.setString(1, "1984___");


        preparedStatement.executeUpdate();


        Statement statement = connection.createStatement();

        //statement.executeUpdate("INSERT INTO EXAMPLE VALUES(NULL, '1984', 'Karel', 'Lorem ipsum', 14400)");
    }
}

// SQL Injection
