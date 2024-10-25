package CodeWars;

import java.util.ArrayList;

public class Katas {


     /* STRING ENDS WITH - https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
     Complete the solution so that it returns true if the first argument(string)
     passed in ends with the 2nd argument (also a string). */
     public static boolean SEWSolution(String str, String ending) {
         return str.endsWith(ending);
     }

     /* REVERSED STRINGS - https://www.codewars.com/kata/5168bb5dfe9a00b126000018
     Complete the solution so that it reverses the string passed into it.
      */
    public static String RSSolution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    /* VOWEL COUNT - https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
        Return the number (count) of vowels in the given string.
        We will consider a, e, i, o, u as vowels for this Kata (but not y).
        The input string will only consist of lower case letters and/or spaces.
     */
    public static int VCSolution(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount ++;
            }
        }

        return vowelCount;
    }
    /* Count by X - https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java
        Create a function with two arguments that will return an array of the first n multiples of x.
        Assume both the given number and the number of times to count will be positive numbers greater than 0.
        Return the results as an array or list ( depending on language ).
     */
    public static int[] countByKataSolution(int x, int n) {
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {
            results[i] = x * (i + 1);
        }
        return results;
    }


}
