public class Lidar implements Sensor{
    private String status;

    public Lidar(String status) {
        this.status = status;
    }

    @Override
    public void checkStatus() {
        System.out.println("Lidar status: " + status);
    }
}
