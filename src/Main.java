public class Main {
    public static void main(String[] args) {
        CarInfrastructure carInfrastructure = new CarInfrastructure("Panel 1");

        carInfrastructure.add(new Proximity("working"));
        carInfrastructure.add(new Proximity("working"));
        carInfrastructure.add(new Camera("working"));
        carInfrastructure.add(new Temperature("not-working"));
        carInfrastructure.add(new Temperature("not-working"));
        carInfrastructure.add(new Lidar("protection-mode"));

        carInfrastructure.printSensors();
        CarInfrastructureStatistics cis = new CarInfrastructureStatistics();

        carInfrastructure.accept(cis);
        cis.printSatats();
    }
}
