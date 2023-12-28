package oop;

public class MusicPlayer {
    // 속성
    boolean isOn = false;
    int volume = 0;

    // 기능
    void powerOn(){
        isOn = true;
        System.out.println("뮤직플레이어의 전원을 켭니다.");
    }
    void powerOff(){
        isOn = false;
        System.out.println("뮤직플레이어의 전원을 끕니다.");
    }
    void volumeUp(){
        volume++;
        System.out.println("볼륨을 올립니다: " + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("볼륨을 내립니다: " + volume);
    }
    void status(){
        if(isOn == true){
            System.out.println("상태: ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }

    }
}
