public class Masks extends HygieneItems {       // Маски
    protected Masks(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure, size);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Количество в упаковке: %d",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize());
    }
}