package ifpr.eic.pgua.escola.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

    private static Connection entityManager = null;

    public static Connection getConnection() throws SQLException {
        if (entityManager == null) {
            return DriverManager.getConnection("****", "***", "***");
        } else {
            return entityManager;
        }
    }
}
