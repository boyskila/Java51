package com.hackbulgaria51.week4.musicorganizer;

public class Song {
    private String name;
    private String artist;
    private int duration;
    private String album;

    public Song(String name, String artist, int duration, String album) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return String.format("-%s %s %d %s", name, artist, duration, album);
    }
}
