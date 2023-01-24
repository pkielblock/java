package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, "Dezeka Dzk");
            stmt.setString(2, "dzk@gmail.com");
            stmt.setDate(3, new Date(sdf.parse("01/01/2001").getTime()));
            stmt.setDouble(4, 30000.00);
            stmt.setInt(5, 1);

//            stmt = conn.prepareStatement("insert into department (Name) values ('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done, Id = " + id);
                }
            } else {
                System.out.println("No Rows Affected");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            DB.closeStatement(stmt);
            DB.closeConnection();
        }
    }
}