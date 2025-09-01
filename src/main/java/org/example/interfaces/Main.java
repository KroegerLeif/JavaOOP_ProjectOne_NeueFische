package org.example.interfaces;

public class Main {
    public static void main(String[] args) {
        Playable playable = new VideoPlayer();
        Playable playable2 = new MusicPlayer();

        MediaController mediaController = new MediaController();
        mediaController.playMedia(playable);
        mediaController.playMedia(playable2);
    }
}
