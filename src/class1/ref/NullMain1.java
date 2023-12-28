package class1.ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조값을 비워둠
        System.out.println("data = " + data);
        data = new Data(); // 객체를 생성하고 그 참조값을 대입함
        System.out.println("data = " + data);
        data = null; // 참조값을 비움
        System.out.println("data = " + data);
    }
}
