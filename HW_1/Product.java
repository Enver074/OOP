public class Product {
    private String name;
    private int cost;
    private int quantity;
    private String measure;

    protected Product(String name, int cost, int quantity, String measure) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.measure = measure;
    }

    @Override
    public String toString(){
        return String.format("Название: %s; Цена: %d; Количество: %d; Еденица измерения: %s", this.name, this.cost, this.quantity, this.measure);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
