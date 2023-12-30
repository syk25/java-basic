package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역변수
        final int data1;
        data1 = 10; // 최초 1번만 데이터 할당 가능
//        data1 = 20; // 컴파일 오류
        // final 지역변수2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류
    }
    // final 매개변수
    static void method(final int parameter){ // 인자가 들어온 후 매개변수의 값은 변경될 수 없음
//        parameter = 10; // 컴파일 오류 발생
    }
}
