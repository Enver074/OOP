package HW_3.Figures;

import HW_3.Figures.Base.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(int a, int b){
        super(new int[]{a,b,a,b});
    }

    @Override
    public double findArea() {
        return sides[0]*sides[1];
    }

    @Override
    public double perimeter() {
        return (sides[0] + sides[1])*2;
    }
    
    @Override
    public String toString() {
        return String.format("Прямоугольник");
    }
}
