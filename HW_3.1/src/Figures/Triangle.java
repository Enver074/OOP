package HW_3.Figures;

import HW_3.Figures.Base.Polygon;

public class Triangle extends Polygon{


    public Triangle(int a, int b, int c){
        super(new int []{a,b,c});
        if(a+b <= c || b + c <= a || a + c <= b) throw new IllegalArgumentException("There is no such triangle");     
    }

    @Override
    public double findArea() {
        double p = perimeter()/2.0;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    @Override
    public double perimeter() {
        return sides[0] + sides[1] + sides[2];
        
    }
    @Override
    public String toString() {
        return "Треугольник";
    }
}
