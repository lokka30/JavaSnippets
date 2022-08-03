public class WordCapitalizer {

    public static void main(final String[] args) {
        System.out.println(capitalize("tHe QUIcK bROWn FOX jumped OveR tHe Lazy doG"));
    }

    /*
    Capitalizes each word in the input string.

    Author: Lachlan Adamson
    */
    public static String capitalize(final String in) {
        // convert input to a lowercase char array
        final char[] out = in.toLowerCase().toCharArray();

        // for each char, if it's the first in the array or has a space before it,
        // convert it to the uppercase variant.
        for(int i = 0; i < out.length; i++)
            if(i == 0 || out[i - 1] == ' ')
                out[i] = Character.toUpperCase(out[i]);
        
        // return stringified char array
        return new String(out);
    }
}
