public class Temperature implements Sensor{
    private String status;

    public Temperature(String status) {
        this.status = status;
    }

    @Override
    public void checkStatus() {
        System.out.println("Temperature status: " + status);
    }
}
