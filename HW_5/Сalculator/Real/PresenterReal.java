package Сalculator.Real;

import java.io.IOException;
import java.util.InputMismatchException;

import Сalculator.View;

public class PresenterReal {
    static View view;
    Сalculator.Interface.ModelReal model;


    public PresenterReal(Сalculator.Interface.ModelReal m, View v) {
        model = m;
        view = v;
    }

    public void getNumReal() throws IOException{
        try{
            int a = View.getValue("Первое число: ");
            int b = View.getValue("Второе число: ");
            model.setX(a);
            model.setY(b); 
        }
        catch(InputMismatchException e){
            System.out.println("Введите число");
        }
    }

    public void getResultReal() throws IOException{
        int result = model.result();
        view.printReal(result, "Результат: ");
    }

    @Override
    public String toString() {
        return " " + model ;
    }
}
