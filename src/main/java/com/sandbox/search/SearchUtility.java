package com.sandbox.search;

public class SearchUtility {

    public static int linearSearch(int[] array, int taargetValue) {

        int found = -1;
        for (int x = 0; x < array.length; x++) {
            if (array[x] == taargetValue) {
                found = x;
                break;
            }
        }
        return found;
    }

    public static <T> T linearSearch(List<T> objectList, T target){
        T result = null;
        if(objectList.contains(target)){
            result = objectList.get(objectList.indexOf(target));
        }
        return result;
    }
}
