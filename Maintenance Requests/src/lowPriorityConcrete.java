import java.time.LocalDate;

public class lowPriorityConcrete implements requestProduct {
    private String priority;
    private String expireDate;
    private String status;

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request denied");
        printInfo();
    }

    @Override
    public void setExpire() {
        this.expireDate = LocalDate.now().toString();

    }

    @Override
    public void setPriority() {
        this.priority = "Ignore";

    }

    @Override
    public void setStatus() {
        this.status = "Done";

    }

    private void printInfo() {
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
        System.out.println("Expire Day: " + expireDate);
    }

    @Override
    public String getExpire() {
        // TODO Auto-generated method stub
        return expireDate;
    }

    @Override
    public String getPriority() {
        // TODO Auto-generated method stub
        return priority;
    }

    @Override
    public String getStatus() {
        // TODO Auto-generated method stub
        return status;
    }

}
