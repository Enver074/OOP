public class Milk extends Food{       // Молоко
    private int fatContent;             // Жирность

    protected Milk(String name, int cost, int quantity, String measure, String fatContent, String expirationDate) {
        super(name, cost, quantity, measure, expirationDate);
        this.fatContent = Integer.parseInt(fatContent);
    }
    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Процент жирности: %d;"
                , super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getExpirationDate(), this.getFatContent());
    }

    public int getFatContent() {
        return fatContent;
    }
    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }
}
