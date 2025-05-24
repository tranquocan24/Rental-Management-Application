package Contract;

public class Client {
    public Contract requestRentalContract(Contract builder,String contractID, String propertyID, String tenantID, double rentalAmount) {
         return builder.buildContractID(contractID).buildPropertyID(propertyID).buildTenantID(tenantID).buildRentAmount(rentalAmount).signContract();
    }
    public static void main(String[] args) {
        Client client = new Client();
        Permanent buildPara = new Permanent();
        Contract permanetContract = client.requestRentalContract(buildPara, "C100","P100","T100",10000000);
        System.out.println(permanetContract);
    }
}
