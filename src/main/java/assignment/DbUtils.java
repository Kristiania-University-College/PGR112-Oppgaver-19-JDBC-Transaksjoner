package assignment;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;

public class DbUtils {

    public static Connection createDbConnection() throws Exception {

        MysqlDataSource worldDS = new MysqlDataSource();
        worldDS.setServerName(PropertiesProvider.PROPS.getProperty("host"));
        worldDS.setPortNumber(Integer.parseInt(PropertiesProvider.PROPS.getProperty("port")));
        worldDS.setDatabaseName(PropertiesProvider.PROPS.getProperty("db_name"));
        worldDS.setUser(PropertiesProvider.PROPS.getProperty("uname"));
        worldDS.setPassword(PropertiesProvider.PROPS.getProperty("pwd"));
        return worldDS.getConnection();
    }
}
