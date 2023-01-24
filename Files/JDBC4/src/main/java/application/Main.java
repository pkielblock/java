package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DB.getConnection();

            stmt = conn.prepareStatement("update seller set BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");
            stmt.setDouble(1, 200.0);
            stmt.setInt(2, 2);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Done, Rows Affected: " + rowsAffected);
            } else  {
                System.out.println("No Rows Affected");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(stmt);
            DB.closeConnection();
        }
    }
}