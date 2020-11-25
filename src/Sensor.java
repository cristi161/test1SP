public interface Sensor {
    void printSensors();
    void accept(Visitor visitor);
}
