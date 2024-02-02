package Task6;

public class ResizableCircle extends CircleEx2 implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public String toString(){return "ResizableCircle" + super.toString();}

    @Override
    public void resize(int percent){
        setRadius(getRadius() * percent/100.0);
    }
}
