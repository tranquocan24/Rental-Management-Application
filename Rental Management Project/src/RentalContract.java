public class RentalContract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public void terminateContract() {
        System.out.println("Contract " + contractID + " terminated.");

    }

    public String getContractID() {
        return contractID;
    } 



    

    public double getRentAmount() {
        return rentAmount;
    }
}
