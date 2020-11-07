package introjunit;

// junit 5.6.2

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void withName() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String greeting = gentleman.sayHello("John Doe");

        // Than
        assertEquals("Hello John Doe!", greeting);
    }

    @Test
    void withoutName() {
        assertEquals("Hello Anonymous!", new Gentleman().sayHello(null));
    }
}


/* junit 4.12
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class GentlemanTest {

    @Test
    public void withName() {
        assertThat(new Gentleman().sayHello("John Doe"), equalTo("Hello John Doe!"));
    }

    @Test
    public void withNull() {
        assertThat(new Gentleman().sayHello(null), equalTo("Hello Anonymous!"));
    }
}*/
