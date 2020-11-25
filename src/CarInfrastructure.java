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

    @Override
    public void checkStatus() {
        System.out.println("Panel name: " + panelName);
        for (Sensor s : sensors) {
            s.checkStatus();
        }
    }
}
