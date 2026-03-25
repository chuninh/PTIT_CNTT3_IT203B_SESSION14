package dao;

import utils.DatabaseConnectionManager;
import java.sql.*;

public class ProductDAO {

    public int getStockForUpdate(Connection conn, int productId) throws SQLException {
        String sql = "SELECT stock FROM products WHERE product_id = ? FOR UPDATE";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, productId);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("stock");
        }
        return 0;
    }

    public void updateStock(Connection conn, int productId, int quantity) throws SQLException {
        String sql = "UPDATE products SET stock = stock - ? WHERE product_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, quantity);
        ps.setInt(2, productId);
        ps.executeUpdate();
    }
}