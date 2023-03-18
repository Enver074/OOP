package HW_3.Figures;

import HW_3.Figures.Base.Polygon;

public class Triangle extends Polygon{
    public Triangle(double i, double j, double k) throws Exception{
        super(new double []{i,j,k});
        if(i+j <= k || j + k <= i || i + k <= j) throw new IllegalArgumentException("Такой треугольник не может существовать");     
    }

    @Override
    public double area() {
        double p = perimeter()/2.0;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    @Override
    public String toString() {
        return String.format("a = %s, b =  %s, c = %s ", this.getSides()[0], this.getSides()[1], this.getSides()[1]);
    }
}
