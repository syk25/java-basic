package access.b;

import access.a.DefaultClass1;
import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지에서는 default class 접근 불가
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass1 = new DefaultClass2();
    }
}
