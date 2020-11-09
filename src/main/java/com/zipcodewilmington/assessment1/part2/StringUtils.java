package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String[] resultString=sentence.split(" ");
        return resultString;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] resultString=sentence.split(" ");
        return resultString[0];

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] resultString=sentence.split(" ");
        char[] storeCharArray = resultString[0].toCharArray();
        StringBuilder storeReverse= new StringBuilder();

        for (int i = storeCharArray.length - 1; i >= 0; i--)
            storeReverse.append(storeCharArray[i]);

        return storeReverse.toString();

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
   String[] spaceString=sentence.split(" ");
        char[] storeCharArray = spaceString[0].toCharArray();
        StringBuilder storeReverse= new StringBuilder();

        for (int i = storeCharArray.length - 1; i >= 0; i--)
            storeReverse.append(storeCharArray[i]);
        String str=storeReverse.toString();
        StringBuilder strResult = new StringBuilder();
        String upString = str.toUpperCase();
        strResult.append(upString.charAt(0));
        strResult.append(str.substring(1));

      return strResult.toString();


    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        char[] storeCharArray = str.toCharArray();
        StringBuilder storeRemove= new StringBuilder();

        for (int i = 0; i <=storeCharArray.length - 1; i++)
            if(i!=index)
                storeRemove.append(storeCharArray[i]);

        return storeRemove.toString();
    }

}
