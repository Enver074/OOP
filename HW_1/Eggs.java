public class Eggs extends Food{             // Яйца
    private int size;                      // Количество в упаковке

    protected Eggs(String name, int cost, int quantity, String measure, String expirationDate, int size) {
        super(name, cost, quantity, measure, expirationDate);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return String.format("Название: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Количество в упаковке: %d",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getExpirationDate(), this.getSize());
    }
}
