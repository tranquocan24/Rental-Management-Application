import java.time.LocalDate;

public class hightPriorityRequest implements requestProduct {
    private String priority;
    private String expireDate;
    private String status;

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Emergency request, our Administer will contact you immediately !");

    }

    @Override
    public void setExpire() {
        this.expireDate = LocalDate.now().toString();

    }

    @Override
    public void setPriority() {
        this.priority = "Emergency";

    }

    @Override
    public void setStatus() {
        this.status = "Accept";

    }
}
