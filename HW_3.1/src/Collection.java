package HW_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


import HW_3.Figures.Circle;
import HW_3.Figures.Rectangle;
import HW_3.Figures.Square;
import HW_3.Figures.Triangle;
import HW_3.Figures.Base.Figure;



public class Collection {
    // static ArrayList<Figure> allFigures = new ArrayList<>();{
    //     allFigures.add(new Square(7));
    //     allFigures.add(new Rectangle(2, 6));
    //     allFigures.add(new Circle(10));
    //     allFigures.add(new Triangle(3, 4, 5));
    // }

    public int getSize(){
        return Program.allFigures.size();
    }

    public static void sortOfArea(){
        Comparator<Figure> byArea = Comparator.comparing(Figure::findArea);
        Program.allFigures.sort(byArea);
    }

    public static void removeFigure(Scanner input, ArrayList<Figure> allFigure){
        System.out.print("\nКакую фигуру удалить?: ");
        int choice = input.nextInt();
        if (choice < allFigure.size()) {
            allFigure.remove(choice);
            System.out.println("Вы успешно удалили фигуру!");
            Program.menu(input, allFigure);
        } else
            Program.menu(input, allFigure);

    }

    static void changeFigure(Scanner input, ArrayList<Figure> allFigure) {
        System.out.print("\nКакую фигуру изменить?: ");
        int choice = input.nextInt();
        if (choice < allFigure.size()) {
            allFigure.set(choice, Program.addFigure(input));
            Program.addFigure(input);
            System.out.println("Вы успешно удалили фигуру!");
            Program.menu(input, allFigure);
        } else
            Program.menu(input, allFigure);

    }
    public static Figure addSquare(Scanner sc){
        System.out.println("Введите сторону квадрата: ");
        int side = sc.nextInt();
        return new Square(side);
    }

    public static Figure addCircle(Scanner sc){
        System.out.println("Введите радиус: ");
        int radius = sc.nextInt();
        return (new Circle(radius));
    }

    public static Figure addRectangle(Scanner sc){
        System.out.println("Введите длину прямоугольника: ");
        int a = sc.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int b = sc.nextInt();
        return (new Rectangle(a, b));
    }

    public static Figure addTriangle(Scanner sc){
        System.out.println("Введите сторону треугольника a: ");
        int a = sc.nextInt();
        System.out.println("Введите сторону треугольника b: ");
        int b = sc.nextInt();
        System.out.println("Введите сторону треугольника c: ");
        int c = sc.nextInt();
        return (new Triangle(a, b, c));
    }

    // public static void showAll(){
    //     int counter = 1;
    //     for(Figure figure: Main.allFigures){
    //         System.out.printf("%d. %s: %s ", counter, figure.getClass().getSimpleName(), figure.toString());
    //         if (figure instanceof Polygon){
    //             System.out.printf("perimetr: %.1f; ", ((Polygon)figure).perimeter());
    //         }
    //         if (figure instanceof Circle){
    //             System.out.printf("length: %.1f; ", ((Circle)figure).length());
    //         }
    //         System.out.printf("area: %.1f \n", figure.findArea()); 
    //         System.out.println("-----------------------------------------------------");
    //         counter++;
    //     }
    // }
}


    // public void changeFigure(int num, Scanner sc){
    //     if (num < AddFigures.allFigures.size()) {
    //         System.out.println("1. Добавить квадрат");
    //         System.out.println("2. Добавить прямоугольник");
    //         System.out.println("3. Добавить треугольник");
    //         System.out.println("4. Добавить круг");
    //         System.out.println("Выберите номер фигуры для изменения");
    //         int numberFigure = sc.nextInt();
    //         Figure newFigure = new Circle(1);
    //         switch(numberFigure){
    //             case 1:
    //             newFigure = AddFigures.addSquare(sc);
    //             break;
    //             case 2: 
    //             newFigure = AddFigures.addRectangle(sc);
    //             break;
    //             case 3: 
    //             newFigure = AddFigures.addTriangle(sc);
    //             break;
    //             case 4: 
    //             newFigure = AddFigures.addCircle(sc);
    //             break;
    //         }
    //         Collection.allFigures.set(num, newFigure);
    //     }
    // }
