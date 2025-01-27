import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MusicPlayerTest {

    private MusicPlayer musicPlayer;

    @BeforeEach
    public void setUp() {
        musicPlayer = new MusicPlayer();
    }

    @Test
    public void testAddSong() {
        musicPlayer.addSong("Song A");
        assertEquals("Playlist:\n1. Song A\n", musicPlayer.toString());
    }

    @Test
    public void testDeleteSong() {
        musicPlayer.addSong("Song A");
        musicPlayer.addSong("Song B");
        musicPlayer.deleteSong("Song A");
        assertEquals("Playlist:\n1. Song B\n", musicPlayer.toString());
    }

    @Test
    public void testDeleteNonExistentSong() {
        musicPlayer.addSong("Song A");
        musicPlayer.deleteSong("Song B");
        assertEquals("Playlist:\n1. Song A\n", musicPlayer.toString());
    }

    @Test
    public void testPlayNextSong() {
        musicPlayer.addSong("Song A");
        musicPlayer.addSong("Song B");
        assertEquals("Song A", musicPlayer.playNextSong());
        assertEquals("Song B", musicPlayer.playNextSong());
        assertNull(musicPlayer.playNextSong());
    }

    @Test
    public void testPlayPreviousSong() {
        musicPlayer.addSong("Song A");
        musicPlayer.addSong("Song B");
        assertEquals("Song A", musicPlayer.playNextSong());
        assertEquals("Song B", musicPlayer.playNextSong());
        assertEquals("Song A", musicPlayer.playPreviousSong());
        assertNull(musicPlayer.playPreviousSong());
    }

    @Test
    public void testPlayCurrentSong() {
        musicPlayer.addSong("Song A");
        assertEquals("Song A", musicPlayer.playCurrentSong());
        musicPlayer.playNextSong(); // Move to Song A
        assertEquals("Song A", musicPlayer.playCurrentSong());
    }

    @Test
    public void testPlayNonExistentSong() {
        musicPlayer.addSong("Song A");
        assertNull(musicPlayer.playSong("Song B"));
    }

    @Test
    public void testShufflePlaylist() {
        musicPlayer.addSong("Song A");
        musicPlayer.addSong("Song B");
        musicPlayer.addSong("Song C");
        musicPlayer.shufflePlaylist();
        // No assertion, check console output or use multiple possibilities as shuffle result
    }

    @Test
    public void testSearchSong() {
        musicPlayer.addSong("Song A");
        musicPlayer.addSong("Song B");
        assertEquals(1, musicPlayer.searchSong("Song B"));
        assertEquals(-1, musicPlayer.searchSong("Song C"));
    }

    @Test
    public void testPlaySong() {
        musicPlayer.addSong("Song A");
        musicPlayer.addSong("Song B");
        assertEquals("Song B", musicPlayer.playSong("Song B"));
    }

    @Test
    public void testEmptyPlaylist() {
        assertEquals("Playlist:\n", musicPlayer.toString());
        assertNull(musicPlayer.playNextSong());
        assertNull(musicPlayer.playPreviousSong());
        assertNull(musicPlayer.playCurrentSong());
        assertNull(musicPlayer.playSong("Song A"));
        assertEquals(-1, musicPlayer.searchSong("Song A"));
    }
}
