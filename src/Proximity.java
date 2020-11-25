public class Proximity implements Sensor{
    private String status;

    public Proximity(String status) {
        this.status = status;
    }

    @Override
    public void printSensors() {
        System.out.println("Proximity status: " + status);
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
