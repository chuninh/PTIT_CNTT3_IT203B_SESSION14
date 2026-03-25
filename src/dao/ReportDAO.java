package dao;

import utils.DatabaseConnectionManager;
import java.sql.*;

public class ReportDAO {

    public void getTopBuyers() {
        try (Connection conn = DatabaseConnectionManager.getInstance().getConnection()) {

            CallableStatement cs = conn.prepareCall("{CALL SP_GetTopBuyers()}");
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println("User: " + rs.getInt("user_id") +
                        " Orders: " + rs.getInt("total_orders"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}