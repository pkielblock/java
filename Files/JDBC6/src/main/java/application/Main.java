package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;


        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false); //Dont confirm operations automatically.

            stmt = conn.createStatement();

            int rowsAffected = stmt.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");

//            int x = 1;
//
//            if (x < 2) {
//                throw new SQLException("Fake Error");
//            }

            int rowsAffected2 = stmt.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");

            conn.commit(); //Confirm all commands have succeeded

            System.out.println("Done, rows affected1: " + rowsAffected);
            System.out.println("Done, rows affected2: " + rowsAffected2);

        } catch (SQLException e) {
            try {
                conn.rollback(); // if exception happens, rollback changes
                throw new DbException("Transaction rolled back, caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback, caused by: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(stmt);
            DB.closeConnection();
        }
    }
}