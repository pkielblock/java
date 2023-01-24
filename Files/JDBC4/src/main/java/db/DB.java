package db;

import javax.swing.plaf.nimbus.State;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection conn;

    public static Properties loadPropeties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            if (conn == null) {
                Properties props = loadPropeties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return conn;
    }

    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement stmt) {
        try {
            stmt.close();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
}
