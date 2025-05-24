package Contract;

public interface Contract {
    Contract buildContractID(String contractID);
    Contract buildPropertyID(String propertyID);
    Contract buildTenantID(String tenantID);
    Contract buildRentAmount(double rentalAmount);
    Contract signContract();
}
