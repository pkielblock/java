package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM department");

            while(rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);
            DB.closeConnection();
        }
    }
}