package Сalculator.Complex.MathActions;

import java.io.IOException;

import Сalculator.Menu;
import Сalculator.Abstract.CalcModelComplex;

public class DivActComplex extends CalcModelComplex{
    public void DivAction(){
        

    }

    @Override
    public int resultReal() throws IOException {
        try {
            return x / y;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        return Menu.menuComplex();
    }

    @Override
    public int resultImag() throws IOException {
        try {
            return j / k;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        return Menu.menuComplex();
        
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

    @Override
    public void setJ(int value) {
        super.j = value;
    }

    @Override
    public void setK(int value) {
        super.k = value;
    }

    @Override
    public String toString() {
        if(x==0||y==0){
            return String.format("Делить на ноль нельзя: %d+%di / %d+%di", x, j, y, k );  
        }
        else if(j==0||k==0){
            return String.format("Делить на ноль нельзя: %d+%di / %d+%di", x, j, y, k );
        }
        else{
            return String.format("%d+%di / %d+%di = %d+%di", x, j, y, k, x/y, j/k);
        }       
    }
}
