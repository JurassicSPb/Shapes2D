package Shapes;

/**
 * Created by Юрий on 16.06.2016.
 */
public class Triangle extends MultiAngle{
    private int height;
    private int base;
    public Triangle (int height, int base)
    {
        super (3, "Треугольник");
        this.height=height;
        this.base=base;
    }

    public int triangleArea()
    {
        int figureArea;
        figureArea = (height*base)/2;
        return figureArea;
    }
}