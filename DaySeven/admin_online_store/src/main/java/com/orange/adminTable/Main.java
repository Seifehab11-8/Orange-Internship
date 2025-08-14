package com.orange.adminTable;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/online_store", "root", "password");
             Statement stat = connection.createStatement()) {

            System.out.println("connection status: " + connection.isValid(0));

            // Create table if it doesn't exist
            stat.executeUpdate(
                "CREATE TABLE IF NOT EXISTS admin (" +
                "id INT PRIMARY KEY, " +
                "username VARCHAR(50) NOT NULL, " +
                "email VARCHAR(50) NOT NULL, " +
                "u_password VARCHAR(50) NOT NULL)"
            );

            // Clear table
            stat.executeUpdate("TRUNCATE TABLE admin");

            // Insert sample data
            stat.executeUpdate(
                "INSERT INTO admin (id, username, email, u_password) VALUES " +
                "(1, 'seif', 'semaziz2003@gmail.com', 'password')," +
                "(2, 'mohamed', 'mohamed@gmail.com', 'passordsa')," +
                "(3, 'medhat', 'medhat@gmail.com', '122345435')"
            );

            // Query by ID
            String queryString = String.format("SELECT * FROM admin WHERE id = %d", id);
            try (ResultSet rs = stat.executeQuery(queryString)) {
                while (rs.next()) {
                    System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("username") + " - " +
                        rs.getString("email") + " - " +
                        rs.getString("u_password")
                    );
                }
            }

            stat.executeUpdate("DROP TABLE admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}