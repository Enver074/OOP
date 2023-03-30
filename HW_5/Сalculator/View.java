package Сalculator;

import java.util.Scanner;
import Сalculator.Interface.Action;


public class View {
    static Action mathAction;

    static Scanner in = new Scanner(System.in);

    public static int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void printReal(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public void printComplex(int data1, int data2, String title) {
        System.out.printf("%s  %d+%di \n", title, data1, data2);
    }
}

