public interface Visitor {
    void visit(Proximity proximity);
    void visit(Lidar lidar);
    void visit(Camera camera);
    void visit(Temperature temperature);
}
