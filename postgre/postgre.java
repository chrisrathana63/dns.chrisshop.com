import java.sql.*;

public class PostgresDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:8080/chrisshopcom_db";
        String user = "dns.chrisshop.com";
        String password = "secret123";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to PostgreSQL!");

            // Insert new row
            String insertSQL = "INSERT INTO test_table (name) VALUES (?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setString(1, "JavaUser");
                pstmt.executeUpdate();
            }

            // Query table
            String selectSQL = "SELECT * FROM test_table";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println(id + " | " + name);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
