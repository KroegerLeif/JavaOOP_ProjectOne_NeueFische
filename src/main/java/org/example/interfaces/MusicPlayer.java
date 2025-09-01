package org.example.interfaces;

public class MusicPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("Spiele Musik ab");
    }
}
