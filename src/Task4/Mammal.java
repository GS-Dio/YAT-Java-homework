package Task4;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[%s]".formatted(super.toString());
    }
}