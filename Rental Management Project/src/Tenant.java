import java.util.ArrayList;
import java.util.List;

public class Tenant {
    private User user;
    private List<RentalContract> listOfContracts;

    public Tenant(User user) {
        this.user = user;
        this.listOfContracts = new ArrayList<>();
    }

    public void requestCreateRentalContract(RentalContract contract) {
        listOfContracts.add(contract);
        System.out.println("Rental contract requested for tenant: " + user.getUserID());
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        if (listOfContracts.remove(contract)) {
            System.out.println("Rental contract terminated for tenant: " + user.getUserID());
        } else {
            System.out.println("Contract not found.");
        }
    }

    public List<RentalContract> getContracts() {
        return listOfContracts;
    }
}
