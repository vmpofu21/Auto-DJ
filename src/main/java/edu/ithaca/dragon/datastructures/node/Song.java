package edu.ithaca.dragon.datastructures.node;

public class Song {
    private String artist;
    private String title;
    private int duration; 
    private int playCount;
    
    
    //public Song(){}

    public Song(String artist, String title, int duration, int playCount) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
        this.playCount = playCount;
    }

    public String toString(){
        return title + " by " + artist + ": " + duration;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getPlayCount() {
        return playCount;
    }
    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }
    
}
