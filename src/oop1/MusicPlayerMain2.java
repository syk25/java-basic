package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.volume = 0;
        musicPlayer.isOn = true;

        // 음악 플레이어 켜기
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        musicPlayer.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayer.volume);
        // 볼륨 증가
        musicPlayer.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayer.volume);

        // 볼륨 감소
        musicPlayer.volume--;
        System.out.println("음악 플레이어 볼륨: " + musicPlayer.volume);

        // 음악 플레이어 상태
        if(musicPlayer.isOn){
            System.out.println("음악 플레이어 상태: ON, 볼륨: " + musicPlayer.volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }

        // 끄기
        musicPlayer.isOn = false;
        System.out.println("음악 플레이어를 끕니다.");
    }
}
