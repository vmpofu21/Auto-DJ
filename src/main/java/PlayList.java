

import edu.ithaca.dragon.datastructures.node.Song;

/**
 * A playlist contains unique Songs
 * the same song cannot appear in the same playlist more than once
 */

public interface PlayList  {

    /**
     * @post add a song to the current playlist, if the song is not already in the playlist
     * if the song was already in the playlist, the playlist remains unchanged
     */
    void add (Song song);

    /**
     * @post removes the song from the playlist
     */
    void remove(Song song);

    /**
     * @return true  if  the playlistis empty and false if otherwise
     */
    boolean ifEmpty();

    /**
     * @return a string of representing all songs in the playlist
     */
    String allSongs();

    /**
     * calculates the duration of each playlist
     * @return total duration of the playlist
     */
    int playlistDuration();

    /**
     * @return next song info
     * remove the current song from the playlist
     * then play the next song
     */
    String playNext();
}
