public class HygieneItems extends Product {  // Предметы гигиены

    private int size;                         // Объем
    protected HygieneItems(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
