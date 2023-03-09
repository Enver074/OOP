public class Food extends Product {     // Еда
    private String expirationDate;      // Срок годности


    protected Food(String name, int cost, int quantity, String measure, String expirationDate) {
        super(name, cost, quantity, measure);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
