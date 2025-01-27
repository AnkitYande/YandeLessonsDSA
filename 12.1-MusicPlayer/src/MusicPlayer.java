public class MusicPlayer {

    private Node head;
    private Node tail;
    private Node current;
    private int size;

    public MusicPlayer() {
        // TODO
    }

    /**
     * Adds a song to the end of the playlist.
     * @param song The song to be added.
     */
    public void addSong(String song) {
        // TODO
    }

    /**
     * Deletes a song from the playlist.
     * @param song The song to be deleted.
     */
    public void deleteSong(String song) {
        // TODO
    }

    /**
     * Plays the next song in the playlist.
     * @return The next song, or null if at the end of the playlist.
     */
    public String playNextSong() {
        // TODO
        return null;
    }

    /**
     * Plays the previous song in the playlist.
     * @return The previous song, or null if at the beginning of the playlist.
     */
    public String playPreviousSong() {
        // TODO
        return null;
    }

    /**
     * Plays the current song.
     * @return The current song, or null if no song is selected.
     */
    public String playCurrentSong() {
        // TODO
        return null;
    }

    /**
     * Plays a specified song from the playlist.
     * @param song The song to play.
     * @return The specified song, or null if the song is not found.
     */
    public String playSong(String song) {
        // TODO
        return null;
    }

    /**
     * Searches for a song in the playlist.
     * @param song The song to search for.
     * @return The index of the song, or -1 if the song is not found.
     */
    public int searchSong(String song) {
        // TODO
        return -1;
    }

    /**
     * Shuffles the playlist (EC)
     */
    public void shufflePlaylist() {
        // TODO
    }

    /**
     * Returns a string representation of the playlist.
     * DO NOT MODIFY THIS FUNCTION
     */
    public String toString() {
        Node current = head;
        int index = 1;
        StringBuilder s = new StringBuilder("Playlist:\n");
        while (current != null) {
            s.append(index).append(". ").append(current.song).append("\n");
            current = current.next;
            index++;
        }
        return s.toString();
    }
}
