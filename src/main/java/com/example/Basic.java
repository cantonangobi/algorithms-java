package com.example;

public abstract class Basic {
    //this is helper class for testing and what not
    
    public static int getLength(int[] list){
        return list.length;
    }
    
    public static String toString(int[] list){
        String result = "[";
        for (int i = 0; i < list.length; i++){
            result = result + list[i];
            if(i < list.length - 1){
                result += ",";
            }
        }
        result += "]";
        return result;
    }
    
    public static void printList(int[] list){
        
        System.out.println(toString(list));
    }
}
