package HW_3.Figures;

import HW_3.Figures.Base.Polygon;

public class Square extends Polygon{
    public Square(Double a) throws Exception{
        super(new double [] {a, a, a, a});
    }   

    @Override
    public String toString() {
        return String.format("Сторона: %s, ", this.getSides()[0]);
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }
}
