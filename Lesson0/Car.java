package Lesson0;

public class Car {
    private int speed;

    public void start(){
        speed = 0;
    }

    private void accelerate(int a){
        speed += a;
    }
}
