package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioFeatures implements Feature{

    private final String title;
    private final int length;
    private final List<String> performer;
    private final List<String> composer;

    public AudioFeatures(String title, int length, List<String> performer) {
        if (Validators.isBlank(title) || Validators.isZeroOrNegative(length) || Validators.isEmpty(performer)) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.length = length;
        this.performer = performer;
        this.composer = null;
    }

    public AudioFeatures(String title, int length, List<String> performer, List<String> composer) {
        if (Validators.isBlank(title) || Validators.isZeroOrNegative(length) || Validators.isEmpty(performer) || Validators.isEmpty(composer)) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.length = length;
        this.performer = performer;
        this.composer = composer;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        if (Validators.isEmpty(composer)) {
            contributors.addAll(performer);
            return contributors;
        }
        contributors.addAll(composer);
        contributors.addAll(performer);
        return contributors;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


}
