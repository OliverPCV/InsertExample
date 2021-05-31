package cz.educanet;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws SQLException {

        Scanner sc = new Scanner(System.in);
        String title;
        String author;
        String glossary;
        int price;

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "");
        Statement statement = connection.createStatement();

        System.out.println("--- Add a book ---");

        System.out.println("title of the book: ");
        title = sc.nextLine();

        System.out.println("author of the book: ");
        author = sc.nextLine();

        System.out.println("glossary of the book: ");
        glossary = sc.nextLine();

        System.out.println("price of the book: ");
        price = sc.nextInt();



        /*while(resultSet.next()) {
            System.out.println(resultSet.getString("title"));

        }*/

        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO book VALUES (NULL, ?, ?, ?, ?)");

        preparedStatement.setString(1, title);
        preparedStatement.setString(2, author);
        preparedStatement.setString(3, glossary);
        preparedStatement.setInt(4, price);

        preparedStatement.executeUpdate();

    connection.close();
    }
}
