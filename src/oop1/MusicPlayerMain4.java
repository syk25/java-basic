package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.powerOn();

        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();

        musicPlayer.status();

        musicPlayer.powerOff();
    }
}
