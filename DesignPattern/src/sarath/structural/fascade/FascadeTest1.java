package sarath.structural.fascade;

public class FascadeTest1 {

    public static void main(String[] args) {

        FascadeDBConnector dbConnect = new FascadeDBConnector();
        dbConnect.getConnection("MYSQL");
        dbConnect.getConnection("Oracle");
    }
}
