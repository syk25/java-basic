package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        testSound(dog);
        testSound(cat);
        testSound(cow);
        testSound(duck);

    }
    static void testSound(Animal animal){ // 다형적 참조
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 메서드 오버라이딩으로 해결
        System.out.println("동물 소리 테스트 종료");
    }
}
