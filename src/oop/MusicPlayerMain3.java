package oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.volume = 0;
        musicPlayer.isOn = true;

        powerOn(musicPlayer);

        volumeUp(musicPlayer);
        volumeUp(musicPlayer);
        volumeDown(musicPlayer);

        status(musicPlayer);

        powerOff(musicPlayer);
    }

    static void powerOn(MusicPlayer musicPlayer){
        musicPlayer.isOn = true;
        System.out.println("뮤직플레이어의 전원을 켭니다.");
    }
    static void powerOff(MusicPlayer musicPlayer){
        musicPlayer.isOn = false;
        System.out.println("뮤직플레이어의 전원을 끕니다.");
    }
    static void volumeUp(MusicPlayer musicPlayer){
        musicPlayer.volume++;
        System.out.println("볼륨을 올립니다: " + musicPlayer.volume);
    }
    static void volumeDown(MusicPlayer musicPlayer){
        musicPlayer.volume--;
        System.out.println("볼륨을 내립니다: " + musicPlayer.volume);
    }
    static void status(MusicPlayer musicPlayer){
        if(musicPlayer.isOn == true){
            System.out.println("상태: ON, 볼륨: " + musicPlayer.volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }
    }
}
