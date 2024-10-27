package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KatasTest {


    @Test
    void StringEndsWithKataTest() {


        assertAll(
                () -> assertTrue(Katas.stringEndsWithKataSolution("samurai", "ai")),
                () -> assertTrue(Katas.stringEndsWithKataSolution("ninja","ja")),
                () -> assertTrue(Katas.stringEndsWithKataSolution("sensei", "i")),
                () -> assertTrue(Katas.stringEndsWithKataSolution("abc","abc")),
                () -> assertTrue(Katas.stringEndsWithKataSolution("abcabc", "bc")),
                () -> assertTrue(Katas.stringEndsWithKataSolution("fails", "ails")),
                () -> assertTrue(Katas.stringEndsWithKataSolution("this", "")),
                () -> assertTrue(Katas.stringEndsWithKataSolution("!@#$%^&*() :-)", ":-)")),
                () -> assertFalse(Katas.stringEndsWithKataSolution("sumo", "omo")),
                () -> assertFalse(Katas.stringEndsWithKataSolution("samurai", "ra")),
                () -> assertFalse(Katas.stringEndsWithKataSolution("abc", "abcd")),
                () -> assertFalse(Katas.stringEndsWithKataSolution("ails", "fails")),
                () -> assertFalse(Katas.stringEndsWithKataSolution("this", "fails")),
                () -> assertFalse(Katas.stringEndsWithKataSolution(":-)", ":-(")),
                () -> assertFalse(Katas.stringEndsWithKataSolution("abc\n", "abc"))
        );
    }
    @Test
    void revesedStringsKataTest() {
        String string1;
        String expected1 = "dlrow";
        String string2;
        String expected2 = "woc";

        string1 = Katas.reversedStringsKataSolution("world");
        string2 = Katas.reversedStringsKataSolution("cow");

        assertAll(
                () -> assertEquals(expected1, string1),
                () -> assertEquals(expected2, string2)
        );
    }
    @Test
    public void testVowelCountKata() {
        assertEquals(5, Katas.vowelCountKataSolution("abracadabra"));
        assertEquals(0, Katas.vowelCountKataSolution(""));
        assertEquals(4, Katas.vowelCountKataSolution("pear tree"));
        assertEquals(13, Katas.vowelCountKataSolution("o a kak ushakov lil vo kashu kakao"));
        assertEquals(168, Katas.vowelCountKataSolution("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
    }
    @Test
    public void testCountByKata() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Katas.countByKataSolution(1,10));
        assertArrayEquals(new int[] {2,4,6,8,10}, Katas.countByKataSolution(2,5));
        assertArrayEquals(new int[] {3,6,9,12,15,18,21}, Katas.countByKataSolution(3,7));
        assertArrayEquals(new int[] {50,100,150,200,250}, Katas.countByKataSolution(50,5));
        assertArrayEquals(new int[] {100,200,300,400,500,600}, Katas.countByKataSolution(100,6));
    }
}