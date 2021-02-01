package week06.d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {

    @Test
    void testAscendingSeries() {
        int[] ascendingSeries = {-18, -9, -7, -1, 0, 2, 3, 5, 6, 17};

        Series series = new Series();

        Assertions.assertEquals(SeriesType.ASCENDING, series.calculateSeriesType(ascendingSeries));

    }

    @Test
    void testDescendingSeries() {
        int[] descendingSeries = {18, 9, 7, 1, 0, -2, -3, -5, -6, -17};

        assertEquals(SeriesType.DESCENDING, new Series().calculateSeriesType(descendingSeries));

    }

    @Test
    void testUnorderedSeries() {
        int[] unorderedSeries = {-18, -9, 7, -1, 0, 2, 3, -5, 6, 17};
        assertEquals(SeriesType.UNORDERED, new Series().calculateSeriesType(unorderedSeries));
    }

    @Test
    void testNotValidSeries() {
        int[] numbers = {3};

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Series().calculateSeriesType(numbers));

        assertEquals("The series must be two element at least!", ex.getMessage());
    }

}