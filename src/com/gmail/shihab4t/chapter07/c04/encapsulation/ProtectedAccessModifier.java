package com.gmail.shihab4t.chapter07.c04.encapsulation;

class Speaker {
}

class AudioPlayer {
    protected boolean openSpeaker(Speaker sp) {
        // details here
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.openSpeaker(new Speaker());
    }
}