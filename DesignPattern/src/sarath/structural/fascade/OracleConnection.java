package sarath.structural.fascade;

import java.sql.Connection;

public class OracleConnection implements  DBConnection{

    @Override
    public Connection getConnection(String hostname, String port, String username, String password) {
        System.out.println("Connected to Oracle database");
        return connection;
    }

    @Override
    public void closeConnection(Connection con) throws Exception {
        if(connection!=null){
            connection.close();
        }
        System.out.println("Oracle Connection Closed");

    }
}
