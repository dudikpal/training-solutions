package ioreadbytes.byteacount;

import ioreadbytes.byteacount.ByteChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByteCheckerTest {
    ByteChecker byteChecker = new ByteChecker();


    @Test
    public void readBytesAndFindAsTest() {
        // data.dat hiányában írtam egyet, ezért az expected 129-et átírtam
        assertEquals(10, byteChecker.readBytesAndFindAs("src/main/resources/ioreadbytes/byteacount/data.dat"));
    }
}