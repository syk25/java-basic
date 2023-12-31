package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        // 업캐스팅
        Parent parent1 = (Parent) child;
        Parent parent2 = child; // 형변환 키워드 생략 가능

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
