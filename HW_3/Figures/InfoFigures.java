package HW_3.Figures;

import java.util.ArrayList;
import HW_3.Figures.Base.Figure;
import HW_3.Figures.Base.Polygon;

public class InfoFigures {
    public final static ArrayList<Figure> figures = new ArrayList<>();{
    try {
        figures.add(new Rectangle(44, 5));
    } catch (Exception e) {
        e.printStackTrace();
    }
    try {
        figures.add(new Square((double) 5));
    } catch (Exception e) {
        e.printStackTrace();
    }
    try {
        figures.add(new Triangle(7, 14, 10));
    } catch (Exception e) {
        e.printStackTrace();
    }
    try {
        figures.add(new Circle(7));
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static void showAllInfo(){
        int counter = 1;
        for(Figure figure: figures){
            System.out.printf("%d. %s:  %s ", counter, figure.getClass().getSimpleName(), figure.toString());
            if(figure instanceof Polygon){
                System.out.printf("Периметр: %.1f, ",((Polygon)figure).perimeter());
            }
            if(figure instanceof Circle){
                System.out.printf("Длина окружности: %.1f, ",((Circle)figure).length());
            }
            System.out.printf("Площадь: %.1f \n", figure.area()); 
            System.out.println("-----------------------------------------------------");
            counter++;
        }
    }

    public static void getAllPerimeter() {
        Double result = (double) 0;
        for (Figure figure :figures) {
            if (figure instanceof Polygon) {
                result += (((Polygon) figure).perimeter());
            }
        }
        System.out.printf("\nПериметр всех фигур = " + result + ";\n");

    }

    public static void getAllArea() {
        Double result = (double) 0;
        for (Figure figure :figures) {
            if (figure instanceof Figure){
            result += (((Figure)figure).area());
        }
    }
        System.out.printf("\nПлощадь всех фигур = " + result + ";\n");
    }
}
