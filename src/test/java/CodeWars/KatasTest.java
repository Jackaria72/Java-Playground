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
    @Test
    public void testVowelCountKata() {
        assertEquals(5, Katas.VCSolution("abracadabra"));
        assertEquals(0, Katas.VCSolution(""));
        assertEquals(4, Katas.VCSolution("pear tree"));
        assertEquals(13, Katas.VCSolution("o a kak ushakov lil vo kashu kakao"));
        assertEquals(168, Katas.VCSolution("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
    }
}