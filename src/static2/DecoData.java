package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue++; // static -> instance 접근 불가
//        instanceMethod();

        staticValue++; // static -> static 접근 가능
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++; // instance -> instance 접근 가능
        instanceMethod();

        staticValue++; // instance -> static 접근 가능
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
