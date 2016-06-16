package Shapes;

/**
 * Created by Юрий on 16.06.2016.
 */
public class Circle extends NoAngle {
    public Circle (int radius){
        super (radius, "Круг");
    }
    public int getDiametr ()
    {
        int getDiametr = radius*2;
        return getDiametr;
    }
}