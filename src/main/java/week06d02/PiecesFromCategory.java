package week06d02;

import java.util.ArrayList;
import java.util.List;

public class PiecesFromCategory {

    private int pieces = 0;
    private Category category;

    public PiecesFromCategory(Category category, int pieces) {
        this.category = category;
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }

    public Category getCategory() {
        return category;
    }

    public void increasePieces() {
        this.pieces++;
    }

    @Override
    public String toString() {
        return "{" + category +
                ": " + pieces +
                '}';
    }
}
