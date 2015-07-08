package com.hackbulgaria51.week4.musicorganizer;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class MusicOrganiser {
    private Vector<Song> songs;

    public MusicOrganiser() {
        songs = new Vector<>();
    }

    public void addSong(Song song) {
        if (!isSongInOrganizer(song)) {
            songs.add(song);
        } else {
            System.out.printf("\"%s\" is already in the organizer%n", song.getName());
        }
    }

    // return true if the song is already in organizer
    private boolean isSongInOrganizer(Song song) {
        for (Song s : songs) {
            if (s.getArtist().equals(song.getArtist()) && s.getAlbum().equals(song.getAlbum())
                    && s.getName().equals(song.getName()) && s.getDuration() == song.getDuration()) {
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return songs.size();
    }

    // return an vector of all the different album names in the Music
    // Organiser
    public Vector<String> getAlbums() {
        return new Vector<>(getUniqueAlbums());
    }

    // return the number of different album names in the Music Organiser
    public int getAlbumsCount() {
        return getUniqueAlbums().size();
    }

    // get all different albums using Set
    private Set<String> getUniqueAlbums() {
        Set<String> songs = new HashSet<>();
        for (Song song : this.songs) {
            songs.add(song.getAlbum());
        }
        return songs;
    }

    // return the songs in an album
    public Vector<Song> getAlbumSongs(String albumName) {
        Vector<Song> songs = new Vector<>();
        for (Song song : this.songs) {
            if (song.getAlbum().equals(albumName)) {
                songs.add(song);
            }
        }
        return songs;
    }

    // return an vector of all the different album names in the Music
    // Organiser, and the number of songs in each album concatenated in one
    // string for each album name.
    public Vector<String> getAlbumsAndSongs() {
        Vector<String> uniqueAlbums = getAlbums();
        Vector<String> uniqueAlbumsAndSongs = new Vector<>();
        for (String album : uniqueAlbums) {
            int size = getAlbumSongs(album).size();
            String str = album + "(" + size + ")";
            uniqueAlbumsAndSongs.add(str);
        }
        return uniqueAlbumsAndSongs;
    }

    @Override
    public String toString() {
        String str = "";
        for (Song song : songs) {
            str += song + "\n";
        }
        return str;
    }
}
