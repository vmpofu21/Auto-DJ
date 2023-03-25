package edu.ithaca.dragon.datastructures.set;

/**
 * A collection of playlists with unique names
 * 
 */

public interface PlaylistCollection{
    /**
     * @return a string representing all playlist names 
     * and their duartion
     */
    String nameAndDuration();

    /**
     * @return a string representing the contents of a particular playlist
     * contents ---> songs in the playlist
     */
    String songsInPlaylist(PlayList playlist);

    /**
     * @param playlist
     * @post removes the playlist from the playlist collection
     */
    void removePlaylist(PlayList playlist);

    /**
     * 
     * @param playlist
     * @post add a new empty playlist to the collection of the playlist
     */
    void addEmptyPlaylist(PlayList playlist);

    /**
     * @post create a new random playlist of a specified duration
     * make a playlist with a given name
     * @param playlist
     * @param duration
     * populate it with a random group of songs that do not repeat(within this playlist or another playlist)
     * playlist should have as many songs as can fit without going over the given duration
     */
    void randomPlaylist(String name, int duration);

    /**
     * 
     * @param song
     * remove a particular song from all playlists at once
     */
    void removeSong(Song song);
}