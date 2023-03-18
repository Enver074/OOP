package HW_3.Figures;

public class Square extends Rectangle{
    public Square(int length){
        super(length, length);
    }


    @Override
    public double findArea() {
        return sides[0] * sides[1];
    }

    @Override
    public double perimeter() {
        return sides[0]*4;
    }

    @Override
    public String toString(){
        return "Квадрат";
    }
    
}
