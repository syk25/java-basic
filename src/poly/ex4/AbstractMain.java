package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        // 추상클래스는 인스턴스 생성 불가
//        AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundOfAnimal(dog);
        soundOfAnimal(cat);
        soundOfAnimal(cow);

        movementOfAnimal(dog);
        movementOfAnimal(cat);
        movementOfAnimal(cow);

    }
    private static void soundOfAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }
    private static void movementOfAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 끝");
    }
}
