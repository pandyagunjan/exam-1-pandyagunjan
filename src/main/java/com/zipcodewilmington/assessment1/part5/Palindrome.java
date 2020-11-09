package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input){
/*
         int i=0;
         int j=input.length()-1;
         int counter =0;
         for(int k=0 ; k < input.length();k++) {
             if (input.charAt(i) == input.charAt(j))
                 counter++;
             i++;
             j--;
         }

             i = 0;
             j = input.length() - 1;
             for (int k = 0; k < input.length() - 1; k++) {
                 String firstStr = String.valueOf(input.charAt(i) + input.charAt(i + 1));
                 String secondStr = String.valueOf(input.charAt(j) + input.charAt(j - 1));
                 if (firstStr.equals(secondStr))
                     counter++;
                 i++;
                 j--;
             }



return counter;
    }
*/
        char[] array = input.toCharArray();

        StringBuilder storeString= new StringBuilder();

            int j = array.length-1;;
           for (int i = 0; i < array.length;)
            {
                if(array[i] == (array[j]) && i!=j)
                {
                    storeString.append(array[i]);
                    storeString.append(array[j]);
                    i++;
                    j--;

                }
                else {
                    storeString.append(array[i]);
                    i++;
                    j--;
                }

        }
return storeString.length();
    }
}
