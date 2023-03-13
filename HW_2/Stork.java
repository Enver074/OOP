import Base.Bird;

public class Stork extends Bird{

    protected Stork(int weight, int height, String eyeColor, int flightAltitude) {
        super(weight, height, eyeColor, flightAltitude);
    }

    @Override
    public void fly() {
        System.out.printf("Я лечу на %d метрах", super.getFlightAltitude());
    }

    @Override
    public void makeSound() {
        System.out.println("звуки аиста");
    }
    
    @Override
    public String toString() {
        return String.format("Аист; %s", super.toString());
    }
}
