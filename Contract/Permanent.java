package Contract;

public class Permanent implements Contract{
    private String contractID;
    private String tenantID;
    private String propertyID;
    private double rentalAmount;
    @Override
    public Contract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }
    @Override
    public Contract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }
    @Override
    public Contract buildRentAmount(double rentalAmount) {
        this.rentalAmount = rentalAmount;
        return this;
    }
    @Override
    public Contract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }
    @Override
    public Contract signContract() {
        System.out.println("Permanent contract signed.");
        return this;
    }
    @Override
    public String toString() {
        return "Permanent [contractID=" + contractID + ", tenantID=" + tenantID + ", propertyID=" + propertyID
                + ", rentalAmount=" + rentalAmount + "]";
    }
    
}
