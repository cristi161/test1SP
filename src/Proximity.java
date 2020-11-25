public class Proximity implements Sensor{
    private String status;

    public Proximity(String status) {
        this.status = status;
    }

    @Override
    public void checkStatus() {
        System.out.println("Proximity status: " + status);
    }
}
