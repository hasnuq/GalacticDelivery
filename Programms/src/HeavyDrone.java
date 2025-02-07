class HeavyDrone extends Drone {
    public HeavyDrone(String id) {
        super(id, 200);
    }

    public double calculateFlightTime(double distance) {
        return distance / 10;
    }
}
