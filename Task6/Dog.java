package Task6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
