import java.util.List;
import java.util.ArrayList;

class OwnerInfor {
    private String ownerName;
    private String location;

    public OwnerInfor(String ownerName, String location) {
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void printInforOwner() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Location: " + location);
    }
}

class Property {
    private String name;
    private double rentAmount;
    private OwnerInfor ownerInfor;

    public Property(String name, double rentAmount, OwnerInfor ownerInfor) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerInfor = ownerInfor;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public OwnerInfor getOwnerInfor() {
        return ownerInfor;
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + name);
        System.out.println("Rent Amount: $" + rentAmount);
        ownerInfor.printInforOwner();
    }

}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
        for (Property property : properties) {
            property.printPropertyDetails();
            totalRent += property.getRentAmount();
            if (property.getRentAmount() > 2000) {
                System.out.println("This is a premium property.");
            } else {
                System.out.println("This is a standard property.");
            }
            double yearlyRent = property.getRentAmount() * 12;
            System.out.println("Yearly Rent: $" + yearlyRent);
            System.out.println("--------------------");
        }
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        Property property1 = new Property("Apartment A", 1500.0, new OwnerInfor("John Doe", "City Center"));
        Property property2 = new Property("House B", 2000.0,new OwnerInfor("Jane Smith", "Suburb"));
        Property property3 = new Property("Condo C", 1800.0,new OwnerInfor("Bob Johnson", "Downtown"));
        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary",
                List.of(property1, property2, property3));
        financialReport.generateReport();
    }
}
