public class Bread extends Food{            // Хлеб

    private String flour;                   // Тип муки

    protected Bread(String name, int cost, int quantity, String measure, String flour, String expirationDate) {
        super(name, cost, quantity, measure, expirationDate);
        this.flour = flour;
    }

    @Override
    public String toString(){
        return String.format("Название: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Тип муки: %s; Срок годности: %s",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), this.getFlour(), super.getExpirationDate());
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }
}
