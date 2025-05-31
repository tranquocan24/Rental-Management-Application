import java.time.LocalDate;

public class midPriorityConcrete implements requestProduct {
    private String priority;
    private String expireDate;
    private String status;

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request accept, estimated completion date is " + expireDate);

    }

    @Override
    public void setExpire() {
        this.expireDate = LocalDate.now().plusMonths(1).toString();

    }

    @Override
    public void setPriority() {
        this.priority = "Medium";

    }

    @Override
    public void setStatus() {
        this.status = "Accepted";

    }
}
