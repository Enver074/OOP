package HW_3.Figures;

import HW_3.Figures.Base.Polygon;

public class Rectangle extends Polygon{

    public Rectangle(double a, double b) throws Exception{
        super(new double[]{a, b});
 
    }

    @Override
    public double area() {
        return sides[0]*sides[1];
    }

    @Override
    public String toString() {
        return String.format("Длина: %s, Ширина: %s", this.getSides()[0], this.getSides()[1]);
    }
}
