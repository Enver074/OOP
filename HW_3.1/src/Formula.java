package HW_3;

import java.util.ArrayList;

import HW_3.Figures.Base.Figure;
import HW_3.Figures.Base.Lengthable;
import HW_3.Figures.Base.Perimeterable;

public class Formula {
    
    public static void findAllPerimeter(ArrayList<Figure> figures) {
        for(Figure figure: figures ){
            if(figure instanceof Perimeterable){
                Perimeterable perimeterable = (Perimeterable)figure;
                System.out.println(String.format("%s - Периметр: %f\n", figure.toString(), perimeterable.perimeter()));
            }

            if(figure instanceof Lengthable){
                Lengthable lengthable = (Lengthable)figure;
                System.out.println(String.format("%s - Длина окружности: %f\n", figure.toString(), lengthable.length()));
            }
        }
    }

    public static void findAllArea(ArrayList<Figure> figures) {
        for(Figure figure: figures){
            System.out.printf(String.format("%s - Площадь: %f\n" , figure.toString(), figure.findArea()));
        }
    }


    
}
