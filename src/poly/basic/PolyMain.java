package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모변수가 부모 인스턴스 참조
        System.out.println("parent -> parent");
        Parent parent = new Parent(); // 부모변수가 부모인스턴스 참조
        parent.parentMethod();

        // 자식변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child child = new Child();
        child.childMethod();

        // 부모변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 자식의 기능은 호출 불가
//        poly.childMethod();

        // 다운캐스팅
        Child child2 = (Child) poly;
        child2.childMethod();
    }
}
