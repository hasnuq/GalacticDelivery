class SpaceStation extends CelestialBody {
    private int stationLevel;

    public SpaceStation(String name, int x, int y, int level) {
        super(name, x, y);
        this.stationLevel = level;
    }
}
