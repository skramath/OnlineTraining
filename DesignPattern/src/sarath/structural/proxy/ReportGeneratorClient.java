package sarath.structural.proxy;

import java.rmi.Naming;

public class ReportGeneratorClient {

    public static void main(String[] args) {
        new ReportGeneratorClient().generateReport();
    }
    public void generateReport(){
        try {
            ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            System.out.println(reportGenerator.generateDailyReports());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
