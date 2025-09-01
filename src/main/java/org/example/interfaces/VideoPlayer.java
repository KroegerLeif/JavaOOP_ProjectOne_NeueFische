package org.example.interfaces;

public class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println( "Spiele Video ab");
    }
}
