public class WordCapitalizer {

    public static void main(final String[] args) {
        System.out.println(capitalize("WITHER SKELETON"));
    }

    /*
    Capitalizes each word in the input string.

    Author: Lachlan Adamson
    */
    public static String capitalize(final String input) {
        final char[] output = input.toLowerCase().toCharArray();
        final char[] upper = input.toUpperCase().toCharArray();
        
        for(int i = 0; i < output.length; i++)
            if(i == 0 || output[i - 1] == ' ')
                output[i] = upper[i];

        return new String(output);
    }
}