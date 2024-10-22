package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KatasTest {


    @Test
    void StringEndsWithKataTest() {


        assertAll(
                () -> assertTrue(Katas.SEWSolution("samurai", "ai")),
                () -> assertTrue(Katas.SEWSolution("ninja","ja")),
                () -> assertTrue(Katas.SEWSolution("sensei", "i")),
                () -> assertTrue(Katas.SEWSolution("abc","abc")),
                () -> assertTrue(Katas.SEWSolution("abcabc", "bc")),
                () -> assertTrue(Katas.SEWSolution("fails", "ails")),
                () -> assertTrue(Katas.SEWSolution("this", "")),
                () -> assertTrue(Katas.SEWSolution("!@#$%^&*() :-)", ":-)")),
                () -> assertFalse(Katas.SEWSolution("sumo", "omo")),
                () -> assertFalse(Katas.SEWSolution("samurai", "ra")),
                () -> assertFalse(Katas.SEWSolution("abc", "abcd")),
                () -> assertFalse(Katas.SEWSolution("ails", "fails")),
                () -> assertFalse(Katas.SEWSolution("this", "fails")),
                () -> assertFalse(Katas.SEWSolution(":-)", ":-(")),
                () -> assertFalse(Katas.SEWSolution("abc\n", "abc"))
        );
    }
    @Test
    void revesedStringsKataTest() {
        String string1;
        String expected1 = "dlrow";
        String string2;
        String expected2 = "woc";

        string1 = Katas.RSSolution("world");
        string2 = Katas.RSSolution("cow");

        assertAll(
                () -> assertEquals(expected1, string1),
                () -> assertEquals(expected2, string2)
        );
    }
}