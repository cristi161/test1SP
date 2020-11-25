public class Lidar implements Sensor{
    private String status;

    public Lidar(String status) {
        this.status = status;
    }

    @Override
    public void printSensors() {
        System.out.println("Lidar status: " + status);
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
