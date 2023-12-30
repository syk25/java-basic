package static1;

public class Data3 {
    // 멤버변수
    public String name; // 인스턴스 변수
    public static int count; // 정적 변수, 클래스 변수, static 변수 등

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
