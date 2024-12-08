import java.util.HashSet;
import java.util.Set;

public class MusicPlaylist {
    public static void main(String[] args) {
        Set<String> playlist = new HashSet<>();

        // Add songs to the playlist
        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 3");

        // Attempt to add a duplicate song
        boolean added = playlist.add("Song 2");
        System.out.println("Duplicate song 'Song 2' added: " + added);

        // Add another unique song
        added = playlist.add("Song 4");
        System.out.println("Unique song 'Song 4' added: " + added);

        // Print the final playlist
        System.out.println("Final playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}