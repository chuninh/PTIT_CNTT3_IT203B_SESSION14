package service;

import dao.OrderDAO;
import dao.ProductDAO;
import utils.DatabaseConnectionManager;

import java.sql.Connection;

public class FlashSaleService {

    private ProductDAO productDAO = new ProductDAO();
    private OrderDAO orderDAO = new OrderDAO();

    public void placeOrder(int userId, int productId, int quantity) {
        Connection conn = null;

        try {
            conn = DatabaseConnectionManager.getInstance().getConnection();

            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            int stock = productDAO.getStockForUpdate(conn, productId);

            if (stock < quantity) {
                throw new RuntimeException("Out of stock!");
            }

            productDAO.updateStock(conn, productId, quantity);

            int orderId = orderDAO.createOrder(conn, userId);

            orderDAO.insertOrderDetailsBatch(conn, orderId, productId, quantity, 100);

            conn.commit();
            System.out.println("User " + userId + " order SUCCESS");

        } catch (Exception e) {
            try {
                if (conn != null) conn.rollback();
                System.out.println("User " + userId + " FAILED: " + e.getMessage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}