import Base.WildAnimal;

public class Wolf extends WildAnimal{
    private String packLeader;

    protected Wolf(int weight, 
                   int height, 
                   String eyeColor, 
                   String habitat, 
                   String date,
                   String packLeader){
        super(weight, height, eyeColor, habitat, date);
        this.packLeader = packLeader;
    }

    @Override
    public void makeSound() {
        System.out.println("у-у-у-у");
    }

    @Override
    public String toString() {
        return String.format("Волк; %s; Вожак стаи: %s", super.toString(), this.packLeader);
       }
}
