class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
    }

    public boolean assignDrone(Drone drone) {
        if (drone.loadCargo(cargo.getWeight())) {
            this.assignedDrone = drone;
            drone.status = "IN_FLIGHT";
            return true;
        }
        return false;
    }
}
