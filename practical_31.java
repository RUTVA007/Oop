import java.util.LinkedList;

public class MusicPlaylist {

    public static void main(String[] args) {

        // Create a LinkedList for playlist
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs to the playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist after adding songs:");
        displayPlaylist(playlist);

        // 2. Play the first song (remove from front)
        if (!playlist.isEmpty()) {
            String playedSong = playlist.removeFirst();
            System.out.println("\nPlaying: " + playedSong);
        }

        System.out.println("Playlist after playing first song:");
        displayPlaylist(playlist);

        // 3. Skip the last song (remove from end)
        if (!playlist.isEmpty()) {
            String skippedSong = playlist.removeLast();
            System.out.println("\nSkipped: " + skippedSong);
        }

        System.out.println("Playlist after skipping last song:");
        displayPlaylist(playlist);
    }

    // Method to display playlist
    public static void displayPlaylist(LinkedList<String> playlist) {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            for (String song : playlist) {
                System.out.println(song);
            }
        }
    }
}
