package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("tweek");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can Fly");
    }
}
