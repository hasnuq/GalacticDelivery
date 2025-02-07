class LightDrone extends Drone {
    public LightDrone(String id) {
        super(id, 50);
    }

    public double calculateFlightTime(double distance) {
        return distance / 20;
    }
}
