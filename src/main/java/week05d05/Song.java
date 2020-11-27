package week05d05;

public class Song {

    private String name;
    private long lengthInSeconds;
    private String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        isEmptyOrNull(name);
        isEmptyOrNull(artist);
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    private void isLengthNull(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("The length must be more than zero!");
        }
    }

    private void isEmptyOrNull(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("The name and artist must not be empty!");
        }
    }

    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }
}
