package week13.d02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
    
    private static Map<String, List<String>> players = new HashMap<>();
    private static Quiz quiz;
    
    
    @BeforeAll
    static void setUp() {
        quiz = new Quiz();
        quiz.readFile();
    }
    
    
    @Test
    void testReadFile() {
        assertEquals(4, quiz.getPlayers().size());
    }
    
    
    @Test
    void testAnswerRightOrWrong() {
        assertEquals("AH2 helyes választ adott a kérdésre" ,quiz.answerIsWrongOrRight("AH2", 5));
    }
    
    
    @Test
    void testmostSkipper() {
        assertEquals("BD452", quiz.mostSkipAnswer());
    }
    
    
    @Test
    void testMostPointsPlayer() {
        assertEquals("GH1234", quiz.playerWithMostPoints());
    }
    
}