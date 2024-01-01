package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스는 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundOfAnimal(cat);
        soundOfAnimal(dog);
        soundOfAnimal(cow);
    }

    private static void soundOfAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
