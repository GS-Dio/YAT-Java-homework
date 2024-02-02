package Task6;

public class BigDog extends Dog{
    public BigDog() {
        super();
    }

    public BigDog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Woooow");
    }
    @Override
    public void greets(Dog another){
        System.out.println("Wooooww");
    }

    public void greets(BigDog another){
        System.out.println("Woooooooooow");
    }
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}
