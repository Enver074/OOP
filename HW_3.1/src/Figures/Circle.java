package HW_3.Figures;

import HW_3.Figures.Base.Figure;
import HW_3.Figures.Base.Lengthable;

public class Circle implements Figure, Lengthable{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
        if(this.radius <= 0) throw new IllegalArgumentException("Радиус не может быть меньше нуля");
        }


        public double length(){
            return 2*Math.PI*radius;
        }

        @Override
        public double findArea() {
            return Math.PI * Math.pow(this.radius, 2);
        }

        @Override
        public String toString() {
        return String.format("Круг");
    }
          
}
