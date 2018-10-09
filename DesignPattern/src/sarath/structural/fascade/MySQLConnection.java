package sarath.structural.fascade;

import java.sql.Connection;

public class MySQLConnection implements DBConnection{


    @Override
    public Connection getConnection(String hostname, String port, String username, String password) {
        System.out.println("Connected to MYSQL database");
        return connection;
    }

    @Override
    public void closeConnection(Connection con)throws Exception{
        if(connection!=null){
            connection.close();
        }
        System.out.println("MY SQL Connection Closed");

    }
}
