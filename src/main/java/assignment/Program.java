package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Program {
    private final WorldDao worldDao;
    private Connection conn;
    public Program() throws Exception {
        conn = DbUtils.createDbConnection();
        worldDao = new WorldDao(conn);

        //**your code here**//


    }

}
