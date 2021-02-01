package week05.d05;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private List<Song> songs = new ArrayList<>();

    public PlayList(List<Song> songList) {
        songs = songList;
    }

    public List<Song> findByLengthGreaterThan(int mins) {
        List<Song> results = new ArrayList<>();
        for (Song song: songs) {
            if (song.getLengthInSeconds() / 60 > mins) {
                results.add(song);
            }
        }
        return results;
    }
}
