package com.example;

public abstract class SortPractice{
    public static void bubbleSort(int[] list){
        boolean sorted = false;
        int end = list.length - 1;

        while(!sorted){
            sorted = true;
            for(int i = 0; i < end; i++){
                if(list[i] > list[i+1]){
                    swap(list, i, i+1);
                    sorted = false;
                }
            }
            end = end-1;
        }
    }

    public static void selectionSort(int[] list){
        int end = list.length - 1;

        for (int j = 0; j < list.length; j++){
            int largest_index = end;
            for (int i = 0; i < end; i ++ ){
                if (list[i] > list[largest_index]){
                    largest_index = i;
                }    
            }
            swap(list, largest_index, end);
            end -= 1;
        }
        
        
    }

    static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}