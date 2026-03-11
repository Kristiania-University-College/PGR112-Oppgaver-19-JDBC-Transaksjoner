package assignment;

import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.DisableIfTestFails;

import studio.programkode.jatf.java25.BaseAssignment;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static studio.programkode.jatf.java25.Framework.*;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{

    private Connection conn;
    static private final String WorldDaoFQCN = "assignment.WorldDao";
    static private final String CityFQCN = "assignment.City";

    @BeforeEach
    @Override
    public void setUp()  {
        try{ conn = DbTestUtils.createTestDbConnection();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @AfterEach
    public void tearDown() {

        try {
            if (conn != null && !conn.isClosed()) {
                DbTestUtils.dropTestTables(conn);
                conn.close(); // H2 in-memory DB will be dropped when last connection closes
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DisplayName("Test for SQL injection")
    @Test
    @Order(1)
    void task01() throws SQLException {


    }




}
