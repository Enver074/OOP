import Base.WildAnimal;

public class Tiger extends WildAnimal{
    protected Tiger(int weight, 
                    int height, 
                    String eyeColor, 
                    String habitat, 
                    String date){
        super(weight, height, eyeColor, habitat, date);             
        }

    @Override
    public void makeSound() {
        System.out.println("р-р-р-р-р");
    } 

    
    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
       }
}
