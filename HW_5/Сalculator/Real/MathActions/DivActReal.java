package Сalculator.Real.MathActions;

import java.io.IOException;

import Сalculator.Logger;
import Сalculator.Menu;
import Сalculator.Abstract.CalcModelReal;

public class DivActReal extends CalcModelReal{
    public void DivAction(){
        

    }

    @Override
    public int result() throws IOException {
        try{
            return x / y;
            }
        catch (ArithmeticException e){
                System.out.println("Деление на ноль");
                Logger.logger(toString());
            }
        return Menu.menuReal(); 
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
    public String toString() {
        if(x==0||y==0){
            return String.format("Делить на ноль нельзя: %d / %d", x, y );  
        }
        else{
            return String.format("%d / %d = %d", x, y, x/y);
        }       
    }
}
