package assignment;

import org.h2.tools.RunScript;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbTestUtils {

    /**
     * Creates an H2 in-memory database, runs schema.sql and data.sql from src/test/resources,
     * and returns a Connection.
     *
     * Note: caller is responsible for closing the connection.
     */
    public static Connection createTestDbConnection() throws Exception {
        // H2 in-memory DB; MODE=MySQL to behave more like MySQL (optional)
        String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;MODE=MySQL";
        Connection conn = DriverManager.getConnection(url, "sa", "");

        // Run schema then data
        RunScript.execute(conn, new InputStreamReader(
                DbTestUtils.class.getResourceAsStream("/drop.sql"), StandardCharsets.UTF_8));
        RunScript.execute(conn, new InputStreamReader(
                DbTestUtils.class.getResourceAsStream("/schema.sql"), StandardCharsets.UTF_8));
        RunScript.execute(conn, new InputStreamReader(
                DbTestUtils.class.getResourceAsStream("/data.sql"), StandardCharsets.UTF_8));

        return conn;
    }
    public static void dropTestTables(Connection conn) throws Exception {
        // H2 in-memory DB; MODE=MySQL to behave more like MySQL (optional)

        // Run schema then data
        RunScript.execute(conn, new InputStreamReader(
                DbTestUtils.class.getResourceAsStream("/drop.sql"), StandardCharsets.UTF_8));


    }
}
