public class Diapers extends ChildrensProducts{         // Подгузники

    private int size;                                   // Размер

    private int minWeight;                              // Минимальный вес

    private int maxWeight;                              // Максимальный вес

    private String type;                                // Тип
    protected Diapers(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic, int size, int minWeight, int maxWeight, String type) {
        super(name, cost, quantity, measure, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString(){
        return String.format("Название: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Минимальный возраст: %d; Гипоаллергенность: %s, Размер: %d; Минимальный вес: %d; Максимальный вес: %d; Тип: %s",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), this.getMinAge(), this.getHypoallergenic(), this.getSize(), this.getMinWeight(), this.getMaxWeight(), this.getType());
    }

    public int getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
