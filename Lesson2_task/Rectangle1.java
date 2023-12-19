package Lesson2_task;

public class Rectangle1 {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle1() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle1(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimetr(){
        return 2*(length* width);
    }
    public String toString (){
        return "Rectangle1[" +
                "length " + length +
                "Width " + width +
                "Area " + getArea() +
                "Perimetr" + getPerimetr() +
                "]";
    }
}
