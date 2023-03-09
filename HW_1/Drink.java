public class Drink extends Product {    // класс напитки
    private int volume;                 // свойство объем


    protected Drink(String name, int cost, int quantity, String measure, int volume) {
        super(name, cost, quantity, measure);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = Integer.parseInt(volume);
    }
}
