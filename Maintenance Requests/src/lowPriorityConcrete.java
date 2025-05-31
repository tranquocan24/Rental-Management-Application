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

}
