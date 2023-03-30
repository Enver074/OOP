package Сalculator.Complex;

import java.io.IOException;
import java.util.InputMismatchException;

import Сalculator.View;

public class PresenterComplex {
    static View view;
    Сalculator.Interface.ModelComplex model;


    public PresenterComplex(Сalculator.Interface.ModelComplex m, View v) {
        model = m;
        view = v;
    }

    public void getNumComplex(){
        try{
            int a = View.getValue("Первое действительное число: ");
            int j = View.getValue("Первое мнимое число: ");
            int b = View.getValue("Второе действительное число: ");
            int k = View.getValue("Второе мнимое число: ");
            model.setX(a);
            model.setY(b);
            model.setJ(j);
            model.setK(k);

        }
        catch(InputMismatchException e){
            System.out.println("Введите число");
        }
    }

    public void getResultComplex() throws IOException{
        int resultReal = model.resultReal();
        int resultImag = model.resultImag();
        view.printComplex(resultReal, resultImag, "Результат: ");
    }

    @Override
    public String toString() {
        return " " + model ;
    }
}
