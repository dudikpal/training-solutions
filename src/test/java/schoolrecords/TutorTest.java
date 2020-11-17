package schoolrecords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class TutorTest {

    @Test
    public void testTutorTeachingSubject() {
        //Given
        Tutor tutor = new Tutor("Nagy Csilla", Arrays.asList(new Subject("matematika"), new Subject("fizika")));
        //Then

        assertEquals("Nagy Csilla", tutor.getName());
        assertTrue(tutor.tutorTeachingSubject(new Subject("fizika")));
    }

    @Test
    public void testTutorDoesNotTeachingSubject() {
        //Given
        Tutor tutor = new Tutor("Nagy Csilla", Arrays.asList(new Subject("matematika"), new Subject("fizika")));
        //Then

        assertFalse(tutor.tutorTeachingSubject(new Subject("biológia")));
    }

    @Test
    void testEmptyTutorName() throws IllegalArgumentException {
        //Tutor tutor = new Tutor("", Arrays.asList(new Subject("fikika")));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Tutor("", null));
        assertEquals("Tutor name must not be empty!", ex.getMessage());
    }
}