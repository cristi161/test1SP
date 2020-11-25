import java.util.ArrayList;

public class CarInfrastructureStatistics implements Visitor{
    /*
    * [0] -> working
    * [1] -> not-working
    * [2] -> protection-mode
    * */
    private ArrayList<Integer> camera = new ArrayList<>();
    private ArrayList<Integer> lidar = new ArrayList<>();
    private ArrayList<Integer> temperature = new ArrayList<>();
    private ArrayList<Integer> proximity = new ArrayList<>();

    public CarInfrastructureStatistics() {
        camera.add(0);
        camera.add(0);
        camera.add(0);
        lidar.add(0);
        lidar.add(0);
        lidar.add(0);
        temperature.add(0);
        temperature.add(0);
        temperature.add(0);
        proximity.add(0);
        proximity.add(0);
        proximity.add(0);
    }

    public void printSatats() {
        System.out.println("[0] -> working, [1] -> not-working, [2] -> protection-mode");
        System.out.println("CarInfrastructureStatistics{" +
                "camera=" + camera +
                ", lidar=" + lidar +
                ", temperature=" + temperature +
                ", proximity=" + proximity +
                '}');
    }

    @Override
    public void visit(Proximity proximity) {
        if (proximity.getStatus().equals("working")) {
            Integer i = this.proximity.get(0);
            this.proximity.set(0, ++i);
        } else if (proximity.getStatus().equals("not-working")){
            Integer i = this.proximity.get(1);
            this.proximity.set(1, ++i);
        } else {
            Integer i = this.proximity.get(2);
            this.proximity.set(2, ++i);
        }
    }

    @Override
    public void visit(Lidar lidar) {
        if (lidar.getStatus().equals("working")) {
            Integer i = this.lidar.get(0);
            this.lidar.set(0, ++i);
        } else if (lidar.getStatus().equals("not-working")){
            Integer i = this.lidar.get(1);
            this.lidar.set(1, ++i);
        } else {
            Integer i = this.lidar.get(2);
            this.lidar.set(2, ++i);
        }
    }

    @Override
    public void visit(Camera camera) {
        if (camera.getStatus().equals("working")) {
            Integer i = this.camera.get(0);
            this.camera.set(0, ++i);
        } else if (camera.getStatus().equals("not-working")){
            Integer i = this.camera.get(1);
            this.camera.set(1, ++i);
        } else {
            Integer i = this.camera.get(2);
            this.camera.set(2, ++i);
        }
    }

    @Override
    public void visit(Temperature temperature) {
        if (temperature.getStatus().equals("working")) {
            Integer i = this.temperature.get(0);
            this.temperature.set(0, ++i);
        } else if (temperature.getStatus().equals("not-working")){
            Integer i = this.temperature.get(1);
            this.temperature.set(1, ++i);
        } else {
            Integer i = this.temperature.get(2);
            this.temperature.set(2, ++i);
        }
    }
}
