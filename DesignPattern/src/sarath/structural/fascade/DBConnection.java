package sarath.structural.fascade;

import java.sql.Connection;

public interface DBConnection {
    public Connection connection = null;
    public Connection getConnection(String hostname,String port,String username,String password);
    public void closeConnection(Connection con) throws Exception;
}
