class CelestialBody {
    protected String name;
    protected int coordinateX, coordinateY;

    public CelestialBody(String name, int x, int y) {
        this.name = name;
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public double distanceTo(CelestialBody other) {
        return Math.sqrt(Math.pow(this.coordinateX - other.coordinateX, 2) +
                Math.pow(this.coordinateY - other.coordinateY, 2));
    }
}
