package HW_3.Figures;

import HW_3.Figures.Base.Figure;

public class Circle extends Figure{
    protected double radius;

    public Circle(double radius) throws Exception{
        this.radius = radius;
        if(radius <= 0){
            throw new Exception("Круг с отрицательным радиусом не может существовать");
        }
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double length(){
        return 2 * Math.PI * radius; 
    }

    @Override
    public String toString(){
        return String.format("Радиус: %s", this.radius);
    }

}
