package com.example;

public abstract class Search {
    
    //Linear search
    public static int indexOfLinear(int target, int[] list){
        //returns the index of the target or -1 if the target doesn't exist in list
        //complexity of O(n)
        for (int i = 0; i < list.length; i ++){
            if (target == list[i]){
                return i;
            }
        }

        return -1;
    }

    public static boolean containsLinear(int target, int[] list){
        //returns true if the target exists in the list or false otherwise
        //complexity of O(n)
        for (int i = 0; i < list.length; i++){
            if (target == list[i]){
                return true;
            }
        }

        return false;
    }

    //binary search iterative
    public static int indexOfBinary(int target, int[] list){
        
        int start = 0;
        int end = list.length -1;
        while ( end >= start ){
            //we get the center of the list
            int mid = start + (end - start)/2;
            //we check if target is at the center
            if (target == list[mid]){
            //if target is at center, we have found it
                return mid;
            }
            if (target < list[mid]){
                //if target is lesser than midpoint we check from the beginning to the midpoint - 1
                end = mid - 1;
            }
            else if (target > list[mid]){
                //if target is greater than midpoint we check from the midpoint + 1 to the end
                start = mid + 1;
            }
        }
        return -1;
    }

    public static boolean containsBinary(int target, int[] list){
        
        int start = 0;
        int end = list.length -1;
        while ( end >= start ){
            //we get the center of the list
            int mid = start + (end - start)/2;
            //we check if target is at the center
            if (target == list[mid]){
            //if target is at center, we have found it
                return true;
            }
            if (target < list[mid]){
                //if target is lesser than midpoint we check from the beginning to the midpoint - 1
                end = mid - 1;
            }
            else if (target > list[mid]){
                //if target is greater than midpoint we check from the midpoint + 1 to the end
                start = mid + 1;
            }
        }
        return false;
    }

    //binary search recursive
    public static int indexOfBinaryRecursive(int target, int[] list){
        int start = 0;
        int end = list.length - 1;   
        return indexOfBinaryRecursive(target, list, start, end);
        // return -1;
    }

    public static int indexOfBinaryRecursive(int target, int[] list, int start, int end){
        if (end < start){
            return -1;
        }

        int mid = start + (end - start) / 2;
        
        if (target == list[mid]){
            return mid;
        }
        if (target < list[mid]){
            end = mid - 1;
        }
        else if (target > list[mid]){
            start = mid + 1;
        }

        return indexOfBinaryRecursive(target, list, start, end);        
    }

    public static boolean containsBinaryRecursive(int target, int[] list){
        int start = 0;
        int end = list.length - 1;   
        return containsBinaryRecursive(target, list, start, end);
        // return -1;
    }

    public static boolean containsBinaryRecursive(int target, int[] list, int start, int end){
        if (end < start){
            return false;
        }

        int mid = start + (end - start) / 2;
        
        if (target == list[mid]){
            return true;
        }
        if (target < list[mid]){
            end = mid - 1;
        }
        else if (target > list[mid]){
            start = mid + 1;
        }

        return containsBinaryRecursive(target, list, start, end);        
    }
}
