package Shapes;

/**
 * Created by Юрий on 16.06.2016.
 */
public class Square extends MultiAngle{
    private int length;
    public Square (int length)
    {
        super (4, "Квадрат");
        this.length=length;
    }

    public int squareArea ()
    {
        int squareArea = length*2;
        return squareArea;
    }
}
