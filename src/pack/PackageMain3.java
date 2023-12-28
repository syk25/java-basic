package pack;

import pack.a.*;

public class PackageMain3 {
    Data data = new Data();
    User userA = new User();
    pack.b.User userB = new pack.b.User(); // 이름이 동일한 클래스들 중 하나만 import 문으로 경로 생략 가능
}

