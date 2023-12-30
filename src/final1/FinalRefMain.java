package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형 변수의 상수화

//        data = new Data(); // 상수화된 참조형 변수의 갱신은 불가

        data.value = 10; // 참조 대상의 값은 변경 가능
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
