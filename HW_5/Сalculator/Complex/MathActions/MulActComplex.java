package Сalculator.Complex.MathActions;

import Сalculator.Abstract.CalcModelComplex;

public class MulActComplex extends CalcModelComplex{
    public void MulAct(){
        
    }

    @Override
    public int resultReal() {
        return x * y;
    }
    
    @Override
    public int resultImag() {
        return j * k;
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
        return String.format("%d+%di * %d+%di = %d+%di", x, j, y, k, x*y, j*k);
    }
}
