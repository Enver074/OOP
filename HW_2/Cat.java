import Base.Pet;

public class Cat extends Pet {
    private String wool;

    protected Cat(String nickname,
                  String breed, 
                  String vaccination, 
                  String coatColor, 
                  String birthdate, 
                  int weight, 
                  int height, 
                  String eyeColor,
                  String wool) {
        super(nickname, breed, vaccination, coatColor, birthdate, weight, height, eyeColor);
        this.wool = wool;
        }


    @Override
    public void tenderness() {
        System.out.println("мур-мур");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }
    @Override
    public String toString() {
        return String.format(
            "Кот; %s; Наличие шерсти: %s;", 
            super.toString(), this.wool);
    }
    
}
