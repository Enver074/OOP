package HW_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import HW_3.Figures.Circle;
import HW_3.Figures.InfoFigures;
import HW_3.Figures.Rectangle;
import HW_3.Figures.Square;
import HW_3.Figures.Triangle;
import HW_3.Figures.Base.Figure;

public class Program {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        new InfoFigures();
        menu(input, getArrayB());
        input.close();

    }

    public static ArrayList<Figure> getArrayB() {
        return InfoFigures.figures;
    }

    public static void menu(Scanner input, ArrayList<Figure> arrayList) throws Exception {
        

        System.out.println("\n1. Добавить новую фигуру");
        System.out.println("2. Посчитать периметр у всех фигур");
        System.out.println("3. Посчитать площадь у всех фигур");
        System.out.println("4. Вывода информации о всех периметах, площадях и длиннах окружности всех фигур");
        System.out.println("5. Удаление фигуры");
        System.out.println("6. Сортировки по площади, вывод информации о всех фигурах");
        System.out.print("Введите число: ");
        int choise = input.nextInt();
        System.out.println();
        switch (choise) {
            case 1:
                addFigure(input);
                menu(input, arrayList);
            case 2:
                InfoFigures.getAllPerimeter();
                menu(input, arrayList);
            case 3:
                InfoFigures.getAllArea();
                menu(input, arrayList);
            case 4:
                InfoFigures.showAllInfo();;
                menu(input, arrayList);
            case 5:
                remove(input, arrayList);
                InfoFigures.showAllInfo();
                menu(input, arrayList);
            case 6:
                sortByArea();
                InfoFigures.showAllInfo();
                menu(input, arrayList);
        }
    }

    private static  void sortByArea() {
        Comparator<Figure> byArea = Comparator.comparing(Figure::area);
        Program.getArrayB().sort(byArea);
    
    }

    public static Figure addSquare(Scanner sc) throws Exception{
        System.out.println("Введите сторону квадрата: ");
        double side = sc.nextDouble();
        return new Square(side);
    }
    public static Figure addCircle(Scanner sc) throws Exception{
        System.out.println("Введите радиус: ");
        double radius = sc.nextDouble();
        return (new Circle(radius));
    }

    public static Figure addRectangle(Scanner sc) throws Exception{
        System.out.println("Введите длину прямоугольника: ");
        double length = sc.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double weigth = sc.nextDouble();
        return (new Rectangle(length, weigth));
    }
    public static Figure addTriangle(Scanner sc) throws Exception{
        System.out.println("Введите сторону a: ");
        double a = sc.nextDouble();
        System.out.println("Введите сторону b: ");
        double b  = sc.nextDouble();
        System.out.println("Введите сторону c: ");
        double c  = sc.nextDouble();
        return (new Triangle(a, b, c));
    }
    public static void addFigure(Scanner sc) throws Exception{
        System.out.println("1. Добавить квадрат");
        System.out.println("2. Добавить прямоугольник");
        System.out.println("3. Добавить треугольник");
        System.out.println("4. Добавить круг");
        System.out.println("5. Вернуться в меню");
        System.out.println("Сделайте выбор");
        int num = sc.nextInt();
        switch(num){
            case 1:
                getArrayB().add(addSquare(sc));
                addFigure(sc);
            case 2:
                getArrayB().add(addRectangle(sc));
                addFigure(sc);
            case 3:
                getArrayB().add(addTriangle(sc));
                addFigure(sc);
            case 4:
                getArrayB().add(addCircle(sc));
                addFigure(sc);
            case 5:
                Program.menu(sc, getArrayB());

        }
    }

    public static void remove(Scanner input, ArrayList<Figure> allFigure) throws Exception {
        InfoFigures.showAllInfo();
        System.out.print("\nКакую фигуру удалить?: ");
        int choice = input.nextInt();
        if (choice < allFigure.size()) {
            allFigure.remove(choice);
            System.out.println("Вы успешно удалили фигуру!");
            Program.menu(input, allFigure);
        } else
            System.out.println("Такой фигуры нет в списке");
            Program.menu(input, allFigure);
    
        }
}