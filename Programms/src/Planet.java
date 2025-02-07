class Planet extends CelestialBody {
    private String atmosphereType;

    public Planet(String name, int x, int y, String atmosphereType) {
        super(name, x, y);
        this.atmosphereType = atmosphereType;
    }
}
