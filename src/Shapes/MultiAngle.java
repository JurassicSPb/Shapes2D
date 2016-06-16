package Shapes;

/**
 * Created by Юрий on 16.06.2016.
 */
public class MultiAngle extends Shapes2D{
    public int angleCount;
    public MultiAngle (int angleCount, String figureName) {
        super(figureName);
        this.angleCount=angleCount;
    }
}