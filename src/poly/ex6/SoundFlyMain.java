package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundOfAnimal(dog);
        soundOfAnimal(bird);
        soundOfAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }
    private static void soundOfAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("Start Flying Test");
        fly.fly();
        System.out.println("End Flying Test");
    }

}
