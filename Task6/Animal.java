package Task6;

abstract class Animal {
    private String name;
    public Animal(){
        name = "null";
    }
    public Animal(String name){
        this.name  =  name;
    }
    public abstract void greets();

    abstract public void greeting();
}
