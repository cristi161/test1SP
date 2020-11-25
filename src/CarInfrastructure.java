import java.util.ArrayList;

public class CarInfrastructure implements Sensor{
    private String panelName;
    public ArrayList<Sensor> sensors = new ArrayList<>();

    public CarInfrastructure(String panelName) {
        this.panelName = panelName;
    }

    public void add(Sensor s) {
        sensors.add(s);
    }

    public void accept(Visitor visitor) {
        for (Sensor s : sensors) {
            s.accept(visitor);
        }
    }

    @Override
    public void printSensors() {
        System.out.println("Panel name: " + panelName);
        for (Sensor s : sensors) {
            s.printSensors();
        }
    }
}
