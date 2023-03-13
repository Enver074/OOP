package Base;

public abstract class Bird extends Animals{
    private int flightAltitude;

    protected Bird(int weight, int height, String eyeColor, int flightAltitude) {
        super(weight, height, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }
    
    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }
 
    public abstract void fly();
}
