package CodeWars;

public class Katas {


     /* STRING ENDS WITH
     Complete the solution so that it returns true if the first argument(string)
     passed in ends with the 2nd argument (also a string). */
     public static boolean SEWSolution(String str, String ending) {
         return str.endsWith(ending);
     }

     /* REVERSED STRINGS
     Complete the solution so that it reverses the string passed into it.
      */
    public static String RSSolution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
