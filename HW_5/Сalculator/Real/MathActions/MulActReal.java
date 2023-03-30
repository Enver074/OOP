package Сalculator.Real.MathActions;

import Сalculator.Abstract.CalcModelReal;

public class MulActReal extends CalcModelReal{
    public void MulAction(){

    }

    @Override
    public int result() {
        return x * y;
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
        return String.format("%d * %d = %d", x, y, x*y);
    }
}
