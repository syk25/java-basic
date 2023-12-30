package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계, 동일 패키지

//        defaultValue = 1; // 다른 패키지 접근 불가 -> 컴파일 오류
//        privateValue = 1; // 다른 클래스 접근 불가 -> 컴파일 오류

        publicMethod();
        protectedMethod();

//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
