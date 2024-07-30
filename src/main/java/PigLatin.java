
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        if (in == null || in.isEmpty()) {
            return in; // Return the input if it's null or empty
        }

        // Extract the first character and the rest of the word
        String firstChar = in.substring(0, 1);
        String restOfWord = in.substring(1);

        // Form the Pig Latin word
        String pigLatin = restOfWord + firstChar + "ay";

        return pigLatin;
    }
}
