package Task4;

public class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled,side, side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        side = super.getLength();
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}
