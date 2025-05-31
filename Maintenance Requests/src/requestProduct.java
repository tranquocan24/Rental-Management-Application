public interface requestProduct {
    void setPriority();

    void setExpire();

    void setStatus();

    void processRequest();

    String getPriority();

    String getStatus();

    String getExpire();
}
