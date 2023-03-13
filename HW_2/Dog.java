import Base.Pet;

public class Dog extends Pet{
    private String training;

    protected Dog(String nickname,
                  String breed, 
                  String vaccination, 
                  String coatColor, 
                  String birthdate, 
                  int weight, 
                  int height, 
                  String eyeColor,
                  String training) {
        super(nickname, breed, vaccination, coatColor, birthdate, weight, height, eyeColor);
        this.training = training;
    }

    @Override
    public void tenderness() {
        System.out.println("");
    }

    @Override
    public void makeSound() {
        System.out.println("гав-гав");
    }

    public void training() {
        System.out.println("дрессировка");
    }
    
    @Override
    public String toString() {
        return String.format("Собака; %s; Дресировка: %s", super.toString(), this.training);
       }
    
}
