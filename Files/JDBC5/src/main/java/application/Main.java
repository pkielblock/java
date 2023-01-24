package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("delete from department where Id = ?");
            stmt.setInt(1, 2);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Done, rows affected: " + rowsAffected);
            } else {
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(stmt);
            DB.closeConnection();
        }
    }
}