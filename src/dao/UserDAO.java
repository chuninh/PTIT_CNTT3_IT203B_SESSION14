package dao;

import utils.DatabaseConnectionManager;
import java.sql.*;

public class UserDAO {

    public void insertUser(String name, String email) {
        String sql = "INSERT INTO users(name, email) VALUES (?, ?)";

        try (Connection conn = DatabaseConnectionManager.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}