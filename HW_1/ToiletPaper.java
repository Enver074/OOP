public class ToiletPaper extends HygieneItems{      // Туалетная бумага
    private int layers;                             // Количество слоев

    protected ToiletPaper(String name, int cost, int quantity, String measure, int size, int layers) {
        super(name, cost, quantity, measure, size);
        this.layers = layers;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }
}
