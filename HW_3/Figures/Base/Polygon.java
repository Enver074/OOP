package HW_3.Figures.Base;

public abstract class Polygon extends Figure{
    protected double [] sides;

    protected Polygon(double[] sides){
        this.sides = sides;
        for(double side: sides){
            if (side <= 0) throw new IllegalArgumentException("Сторона не может быть отрицательной");
        }
    }

    public Polygon(Object object, int b, int a, int b2) {
    }

    public double perimeter(){
        double sum = 0;
        for(double side: this.sides){
            sum+=side;
        }
        return sum;
    }

    public double[] getSides(){
        return this.sides;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + "Стороны: " + sides + ", " + "Периметр: " + this.perimeter();
    }
    
}
