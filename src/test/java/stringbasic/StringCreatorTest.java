package stringbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCreatorTest {

    @Test
    void testCreate() {
        // Given
        StringCreator stringCreator = new StringCreator();

        //When
        assertEquals(stringCreator.createStringForHeap(), stringCreator.createStringForHeap());
        assertEquals(stringCreator.createStringForHeap(), stringCreator.createStrongForPool());
        // Then

    }
}
