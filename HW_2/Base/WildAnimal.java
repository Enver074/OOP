package Base;
public abstract class WildAnimal extends Animals{
    private String habitat;
    private String date;

    protected WildAnimal(int weight, 
                         int height, 
                         String eyeColor, 
                         String habitat, 
                         String date){
        super(weight, height, eyeColor);
        this.habitat = habitat;
        this.date = date;
    }
    public String getHabitat() {
        return habitat;
    }

    public String getDate() {
        return date;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Место Обитания: %s; Дата нахождения: %s; %s", 
        this.habitat, this.date, super.toString());
    }
}
