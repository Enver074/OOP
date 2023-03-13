import Base.Bird;

public class Chicken extends Bird{

    protected Chicken(int weight, int height, String eyeColor, int flightAltitude) {
        super(weight, height, eyeColor, flightAltitude);
        
    }

    @Override
    public void fly() {
        System.out.printf("Я лечу на %d метрах", super.getFlightAltitude());
    }

    @Override
    public void makeSound() {
        System.out.println("курлык");
    }
    @Override
    public String toString() {
        return String.format("Курица; %s", super.toString());
    }
}
