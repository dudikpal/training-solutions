package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {

    private List<Photo> photos = new ArrayList<>();

    public void addPhoto(String... photoArray) {
        for (String photoName: photoArray) {
            photos.add(new Photo(photoName));
        }
    }

    public int numberOfStars() {
        int numberOfStars = 0;
        for (Photo photo: photos) {
            if (photo.getQuality() == Quality.TWO_STAR) {
                numberOfStars += 2;
            } else if (photo.getQuality() == Quality.ONE_STAR) {
                numberOfStars++;
            }
        }
        return numberOfStars;
    }

    public void starPhoto(String photoName, Quality quality) {
        boolean findPhoto = false;
        for (Photo photo: photos) {
            if (photo.getName().equals(photoName)) {
                photo.setQuality(quality);
                findPhoto = true;
            }
        }
        if (!findPhoto) {
            throw new PhotoNotFoundException("This photo doesnt exist");
        }
    }

    public List<Photo> getPhotos() {
        return photos;
    }
}
