package sarath.structural.fascade;

import java.sql.Connection;

public class FascadeDBConnector {

     DBConnection connection = null;
     public Connection getConnection(String dbType){
        Connection con = null;
         if("Oracle".equalsIgnoreCase(dbType)){
            connection = new OracleConnection();
            con = connection.getConnection("10.1..2.","300","sarath","ramath");
         }else if("MySQL".equalsIgnoreCase(dbType)){
             connection = new MySQLConnection();
            con =  connection.getConnection("10.1..2.","300","sarath","ramath");
         }else{
             System.out.println("DB Type not supported");
         }
         return con;
     }


}
