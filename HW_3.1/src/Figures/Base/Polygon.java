package HW_3.Figures.Base;

public abstract class Polygon implements Figure, Perimeterable {
    protected int [] sides;

    protected Polygon(int[] sides){
        this.sides = sides;
        for(double side: sides){
            if (side <= 0) throw new IllegalArgumentException("Side can not be negative");
        }
    }

    public double perimeter(){
        int sum = 0;
        for(int side : sides)
            sum += side;
        return sum;
    }

    public int[] getSides(){
        return this.sides;
    }
    
}
