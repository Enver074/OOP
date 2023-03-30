package Сalculator;

import java.io.IOException;

import Сalculator.Complex.PresenterComplex;
import Сalculator.Complex.MathActions.DivActComplex;
import Сalculator.Complex.MathActions.MulActComplex;
import Сalculator.Complex.MathActions.SubActComplex;
import Сalculator.Complex.MathActions.SumActCopmlex;
import Сalculator.Real.PresenterReal;
import Сalculator.Real.MathActions.DivActReal;
import Сalculator.Real.MathActions.MulActReal;
import Сalculator.Real.MathActions.SubActReal;
import Сalculator.Real.MathActions.SumActReal;

public class Menu{ 

    public static void menu() throws IOException{
        System.out.println("_________________");
        System.out.println("1.Рациональные");
        System.out.println("2.Комплексные");
        if(View.in.hasNextInt()){
        Integer choise = View.in.nextInt();
            switch(choise){
                case 1: {
                    menuReal();
                    break;
                }
                case 2: {
                    menuComplex();
                    break;
                }
                default:{
                    System.out.println("Выберите один из пунктов: ");
                    menu();
                }
            }
        }
        else{
            System.out.println("Введите число 3");
        }
    }

    public static void menuText(){
        System.out.println("_________________");
        System.out.println("1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");
        System.out.println("5.Выход в меню");
        System.out.println("6.Выход из программы");

    }

    public static int menuComplex() throws IOException{
        menuText();
        if(View.in.hasNextInt()){
            Integer choise = View.in.nextInt();
            switch(choise){
                case 1:{
                    System.out.println("_________________");
                    System.out.println("Сложение");
                    PresenterComplex sum = new PresenterComplex(new SumActCopmlex(), new View());
                    sum.getNumComplex();
                    sum.getResultComplex();
                    System.out.println(sum.toString());
                    Logger.logger(sum.toString());
                    menuComplex();
                    break;
                }
                case 2:{
                    System.out.println("_________________");
                    System.out.println("Вычитание");
                    PresenterComplex sub = new PresenterComplex(new SubActComplex(), new View());
                    sub.getNumComplex();
                    sub.getResultComplex();
                    System.out.println(sub.toString());
                    Logger.logger(sub.toString());
                    menuComplex();
                    break;
                }
                case 3:{
                    System.out.println("_________________");
                    System.out.println("Умножение");
                    PresenterComplex mul = new PresenterComplex(new MulActComplex(), new View());
                    mul.getNumComplex();
                    mul.getResultComplex();
                    System.out.println(mul.toString());
                    Logger.logger(mul.toString());
                    menuComplex();
                    break;
                }
                case 4:{
                    System.out.println("_________________");
                    System.out.println("Деление");
                    PresenterComplex div = new PresenterComplex(new DivActComplex(), new View());
                    div.getNumComplex();
                    div.getResultComplex();
                    System.out.println(div.toString());
                    Logger.logger(div.toString());
                    menuComplex();
                    break;
                }
                case 5:{
                    menu();
                    break;
                } 
                case 6:{
                    System.exit(0);
                } 
                default:{
                    System.out.println("Выберите операцию");
                    menuComplex();
                    }
                }       
            }   
            else{
                System.out.println("Введите число");
                View.in.next();
            }
        return 0;       
    }
    public static int menuReal() throws IOException{
        menuText();  
        if(View.in.hasNext()){   
            Integer choise = View.in.nextInt();
                if(choise == 1){
                    System.out.println("_________________");
                    System.out.println("Сложение");
                    PresenterReal sum = new PresenterReal(new SumActReal(), new View());
                    sum.getNumReal();
                    sum.getResultReal();
                    System.out.println(sum.toString());
                    Logger.logger(sum.toString());
                    menuReal();
                }
                else if(choise == 2){
                    System.out.println("_________________");
                    System.out.println("Вычитание");
                    PresenterReal sub = new PresenterReal(new SubActReal(), new View());
                    sub.getNumReal();
                    sub.getResultReal();
                    System.out.println(sub.toString());
                    Logger.logger(sub.toString());
                    menuReal();
                }
                else if(choise == 3){
                    System.out.println("_________________");
                    System.out.println("Умножение");
                    PresenterReal mul = new PresenterReal(new MulActReal(), new View());
                    mul.getNumReal();
                    mul.getResultReal();
                    System.out.println(mul.toString());
                    Logger.logger(mul.toString());
                    menuReal();
                }
                else if(choise == 4){
                    System.out.println("_________________");
                    System.out.println("Деление");
                    PresenterReal div = new PresenterReal(new DivActReal(), new View());
                    div.getNumReal();
                    div.getResultReal();
                    System.out.println(div.toString());
                    Logger.logger(div.toString());
                    menuReal();
                }
                else if(choise == 5){
                    menu();
                } 
                else if(choise == 6){
                    System.exit(0);
                } 
                else{
                    System.out.println("Выберите операцию");
                    menuReal();
                }
            }
            else{
                System.out.println("Введите число");
                View.in.next();
            }
        return 0;
    }
}
