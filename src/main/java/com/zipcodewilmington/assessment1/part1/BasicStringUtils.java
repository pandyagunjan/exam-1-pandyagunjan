package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
       StringBuilder strResult = new StringBuilder();
       String upString = str.toUpperCase();
       strResult.append(upString.charAt(0));
       strResult.append(str.substring(1));


        return strResult.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        char[] storeCharArray = str.toCharArray();
        StringBuilder storeReverse= new StringBuilder();

        for (int i = storeCharArray.length - 1; i >= 0; i--)
            storeReverse.append(storeCharArray[i]);

        return storeReverse.toString();

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
       String resultReverse= reverse(str);
       return camelCase(resultReverse);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] chars= str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(Character.isUpperCase(c))
            {
                chars[i]=Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c))
            {
                chars[i]=Character.toUpperCase(c);
            }

        }

        String resultString=new String(chars);
        return resultString;
    }
}
