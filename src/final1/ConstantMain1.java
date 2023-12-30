package final1;

import static final1.Constant.*;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자수:" + currentUserCount);
        if (currentUserCount > MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else{
            System.out.println("게임에 참가합니다.");
        }
    }
}
