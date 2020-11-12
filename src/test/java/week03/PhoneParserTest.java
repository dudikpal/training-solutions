package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneParserTest {

    @Test
    public void testParse() {
        assertEquals(new Phone("30", "1234567").getNumber(), new PhoneParser().parse( "30-1234567").getNumber());
        assertEquals(new Phone("30", "1234567").getPrefix(), new PhoneParser().parse( "30-1234567").getPrefix());

    }
}
