package HW_3;

import java.util.ArrayList;
import java.util.Scanner;

import HW_3.Figures.Circle;
import HW_3.Figures.Rectangle;
import HW_3.Figures.Square;
import HW_3.Figures.Triangle;
import HW_3.Figures.Base.Figure;
import HW_3.Figures.Base.Polygon;


public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu(input, getArrayB());
        input.close();
    }
        static ArrayList<Figure> allFigures = new ArrayList<>();{
        allFigures.add(new Square(7));
        allFigures.add(new Rectangle(2, 6));
        allFigures.add(new Circle(10));
        allFigures.add(new Triangle(3, 4, 5));
    }

    public static ArrayList<Figure> getArrayB() {
        return allFigures;
    }

    public static Figure addFigure(Scanner sc){
        System.out.println("1. Добавить квадрат");
        System.out.println("2. Добавить прямоугольник");
        System.out.println("3. Добавить треугольник");
        System.out.println("4. Добавить круг");
        System.out.println("5. Вернуться в меню");
        System.out.println("Выберите номер");

        int num = sc.nextInt();
        switch(num){
            case 1:
                Collection.addSquare(sc);
                break;
            case 2:
                Collection.addRectangle(sc);
                break;
            case 3:
                Collection.addTriangle(sc);
                break;
            case 4:
                Collection.addCircle(sc);
                break;
            case 5:
                Program.menu(sc, getArrayB());

                break;
        }
        return null;
    }

    public static void menu(Scanner input, ArrayList<Figure> allFigure) {
        System.out.println("\n1. Добавить новую фигуру");
        System.out.println("2. Посчитать периметр у всех фигур");
        System.out.println("3. Посчитать площадь у всех фигур");
        System.out.println("4. Удаление фигуры");
        System.out.println("5. Изменение фигуры");
        System.out.println("6. Сортировки по площади, вывод информации о всех фигурах");
        System.out.print("Введите число: ");
        int choise = input.nextInt();
        System.out.println();
        switch (choise) {
            case 1:
                addFigure(input);
                menu(input, allFigure);
            case 2:
                Formula.findAllPerimeter(allFigure);
                menu(input, allFigure);
            case 3:
                Formula.findAllArea(allFigure);
                menu(input, allFigure);
            case 4:
                Collection.removeFigure(input, allFigure);
                menu(input, allFigure);
            case 5:
                Collection.changeFigure(input, allFigure);
                menu(input, allFigure);
            case 6: 
                Collection.sortOfArea();
                showAll();
                menu(input, allFigure);
            }
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
        public static void showAll(){
            int counter = 1;
            for(Figure figure: Program.allFigures){
                System.out.printf("%d. %s: %s ", counter, figure.getClass().getSimpleName(), figure.toString());
                if (figure instanceof Polygon){
                    System.out.printf("perimetr: %.1f; ", ((Polygon)figure).perimeter());
                }
                if (figure instanceof Circle){
                    System.out.printf("length: %.1f; ", ((Circle)figure).length());
                }
                System.out.printf("area: %.1f \n", figure.findArea()); 
                System.out.println("-----------------------------------------------------");
                counter++;
            }
        }
    }
