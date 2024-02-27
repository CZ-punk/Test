package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumnUp();
        player.volumnUp();
        player.volumnDown();
        player.showStatus();
        player.off();
    }
}
