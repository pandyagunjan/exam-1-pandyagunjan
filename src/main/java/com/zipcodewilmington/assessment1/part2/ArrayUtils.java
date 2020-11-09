package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
       Integer counter=0;
        for (Object s : objectArray) {
            if (s == objectToCount) {
              counter++;
            }
        }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int arrayLength= objectArray.length;
        Integer[] storeAltered= new Integer[arrayLength-1];
        int j=0;
        for (int i = 0; i < arrayLength ;) {
            if(objectArray[i] == objectToRemove)
                i++;
            else {
                storeAltered[j] = Integer.valueOf((Integer) objectArray[i]);
                j++;
                i++;
            }
        }
        Integer[] output = new Integer[j];
        for(int i = 0; i < j; i++){
            output[i] = storeAltered[i];
        }
        return output;

     }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        ArrayList<Integer> tracker = new ArrayList<Integer>();
        for(int i=0 ; i <= 12 ; i ++)
        {
           tracker.add(0);
        }

        for(int i= 0 ; i < objectArray.length ; i++)
        {
            int valueAtI= (int) objectArray[i];
            Integer a = tracker.get(valueAtI);
            a++;
            tracker.set(valueAtI,a);
        }


        Integer max = tracker.get(0);
        for (int i = 1; i < tracker.size(); i++) {
            if (tracker.get(i) > max)
                max = tracker.get(i);
        }

            return tracker.indexOf(max);


    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        ArrayList<Integer> tracker = new ArrayList<Integer>();
        for(int i=0 ; i <= 12; i ++)
        {
            tracker.add(0);
        }

        for(int i= 0 ; i < objectArray.length ; i++)
        {
            int valueAtI= (int) objectArray[i];
            Integer a = tracker.get(valueAtI);
            a++;
            tracker.set(valueAtI,a);
        }


        Integer max = tracker.get(0);
        for (int i = 1; i < tracker.size(); i++) {
            if (tracker.get(i) < max && tracker.get(i)!=0)
                max = tracker.get(i);
        }

        return tracker.indexOf(max);
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Integer[] storeAltered= new Integer[objectArray.length+objectArrayToAdd.length];

        for (int i = 0; i < objectArray.length; i++) {
            storeAltered[i]=(Integer)objectArray[i];
        }
        int j=0;
        for (int i = objectArray.length+1; i < storeAltered.length; i++) {
             storeAltered[i]=(Integer)objectArrayToAdd[j];
             j++;
        }

        return storeAltered;
    }
}
