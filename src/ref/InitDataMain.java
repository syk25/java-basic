package ref;

public class InitDataMain {
    public static void main(String[] args) {
        InitData initData = new InitData(); // 자동 초기화 됨
        System.out.println("initData.value1 = " + initData.value1); // 자동 초기화 됨
        System.out.println("initData.value2 = " + initData.value2);
    }
}
