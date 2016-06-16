import Shapes.Triangle;
import Shapes.Circle;
import Shapes.Square;
import Shapes.Ellipse;

/**
 * Created by Юрий on 16.06.2016.
 */
public class Main {
    public static void main (String [] args) {

        Triangle triangle = new Triangle(10, 5);
        System.out.println("Название фигуры: " + triangle.figureName + "\n" + "Количество углов: "
        + triangle.angleCount + "\n" + "Площадь треугольника: " + triangle.triangleArea());

        Circle circle = new Circle (10);
        System.out.println ("\n" + "Название фигуры: " + circle.figureName + "\n" + "Радиус круга: " + circle.radius + "\n"
        + "Диаметр круга: " + circle.getDiametr());

        Square square = new Square (8);
        System.out.println ("\n" + "Название фигуры: " + square.figureName + "\n" + "Количество углов: "
        + square.angleCount + "\n" + "Площадь круга: " + square.squareArea());

        Ellipse ellipse = new Ellipse(25);
        System.out.println ("\n" + "Название фигуры: " + ellipse.figureName + "\n"
        + "Ось эллипса: " + ellipse.getEllipseAxis(150));










    }
}