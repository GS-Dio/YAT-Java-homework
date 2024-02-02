package Task6;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name){
        super(name);
    }

    public void greeting(){
        System.out.println("Meow!");
    };
    @Override
    public void greets(){
        System.out.println("Meow");
    }


}
