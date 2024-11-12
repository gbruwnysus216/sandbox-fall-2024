package com.sandbox.Search_GB;

import java.util.*;
import java.util.stream.IntStream;

public class SearchUtility {
    /** linear search implementation
     *@param array array of integers
     *@param targetValue target integer
     *@return index of targetValue in array
     */
    public static int linearSearch(int[] array, int targetValue) {
        // Check if array is null or empty
        if (array == null || array.length == 0) {
            return -1;
        }
        // Check if targetValue is in array
        final int[] found = {-1};
        IntStream.range(0, array.length).forEach(x -> {
            if (array[x] == targetValue) {
                found[0] = x;
                return;
            }
        });
        return found[0];
    }

    /** linear search implementation for java collections
     *@param array array of objects
     *@param target target object
     * @param   <T> generic type
     *@return true if target object is found in array
     */
    public static <T extends Comparable<T>> boolean linearSearch(T[] array, T target) {
        boolean found = false;
        for (T t : array) {
            if (t.compareTo(target) == 0) {
                found = true;
                break;
            }
        }
        return found;
    }

    /**
     * Binary search Recursive implementation
     * @param array array of integers
     * @param targetValue target integer
     * @return index of targetValue in array
     */
    public static int binarySearchRecursive(int[] array, final int targetValue) {
        // Check if array is null or empty
        if (array == null || array.length == 0) {
            return -1;
        }
        return binarySearchRecursive(array, targetValue, 0, array.length - 1);
    }

    /**
     * Binary Search Recursive implementation
     * @param array array of integers
     * @param targetValue target integer
     * @param min minimum index
     * @param max maximum index
     * @return index of targetValue in array
     */
    private static int binarySearchRecursive(int[] array, int targetValue, int min, int max) {
        if (min > max) {
            return -1;
        }

        int mid = min + (max - min) / 2;

        if (array[mid] == targetValue) {
            return mid;
        } else if (array[mid] < targetValue) {
            return binarySearchRecursive(array, targetValue, mid + 1, max);
        } else {
            return binarySearchRecursive(array, targetValue, min, mid - 1);
        }
    }

    public static int binarySearchIterative(int[] array, int targetValue) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (array[mid] == targetValue) {
                return mid;
            } else if (array[mid] < targetValue) {
                // if target is greater, ignore left half of array
                min = mid + 1;
            } else {
                // if target is smaller, ignore right half of array
                max = mid - 1;
            }
        }
        return -1;
    }
}