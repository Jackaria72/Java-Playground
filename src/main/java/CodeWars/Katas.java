package CodeWars;

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
}
