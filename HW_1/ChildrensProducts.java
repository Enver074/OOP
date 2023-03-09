public class ChildrensProducts extends Product{ // Детские товары
    private int minAge;                         // минимальный возраст
    private String hypoallergenic;              // гипоалергенность


    protected ChildrensProducts(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }




    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(String hypoallergenic) {
        hypoallergenic = hypoallergenic;
    }
}
