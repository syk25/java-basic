package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("Roo!");
    }

    @Override
    public void fly() {
        System.out.println("Flap");
    }
}
