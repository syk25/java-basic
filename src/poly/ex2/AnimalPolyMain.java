package poly.ex2;

public class AnimalPolyMain {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};
        for (Animal animal : animals) {
            soundOfAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundOfAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }
}
