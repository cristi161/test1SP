public class Temperature implements Sensor{
    private String status;

    public Temperature(String status) {
        this.status = status;
    }

    @Override
    public void printSensors() {
        System.out.println("Temperature status: " + status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
