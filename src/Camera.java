public class Camera implements Sensor{
    private String status;

    public Camera(String status) {
        this.status = status;
    }

    @Override
    public void checkStatus() {
        System.out.println("Camera status: " + status);
    }
}
