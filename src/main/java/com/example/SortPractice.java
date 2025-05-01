package com.example;

public abstract class SortPractice{
    static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

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

    public static void insertionSort(int[] list){
        int end = list.length - 2;

        for (int i = 0; i < list.length; i ++){
            for (int j = end; j >= 0; j--){
                if (list[j] > list[j+1]){
                    swap(list, j, j+1);
                }
            }
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

    public static void quickSort(int[] list){
        quickSort(list);
    }

    public static void quickSort(int[] list, int start, int end){

    }

    
}