package com.hackbulgaria51.week4.musicorganizer;

import java.util.Vector;

public class MusicOrganizerMain {
    public static void main(String[] args) {
        MusicOrganiser mo = new MusicOrganiser();
        mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
        mo.addSong(new Song("W(hite)rapper", "Eminem", 213, "The Marshall Mathers LP"));
        mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
        mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
        mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
        mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));
        System.out.println("Music organizer content\n" + mo);
        System.out.println("Music organizer size: " + mo.getCount());
        System.out.println("\nAll unique albums in the organizer");
        Vector<String> albums = mo.getAlbums();
        for (int i = 0; i < albums.size(); i++) {
            System.out.println("-" + albums.get(i));
        }
        System.out.println("\nNumber of unique albums in the organizer: " + mo.getAlbumsCount());
        Vector<Song> songs = mo.getAlbumSongs("The Marshall Mathers LP");
        System.out.println("\n" + songs.get(0).getAlbum() + " songs");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("-" + songs.get(i).getName());
        }
        System.out.println();
        System.out.println("Songs count in every unique album in the organizer");
        Vector<String> s = mo.getAlbumsAndSongs();
        for (int i = 0; i < s.size(); i++) {
            System.out.println("-" + s.get(i));
        }
    }
}
