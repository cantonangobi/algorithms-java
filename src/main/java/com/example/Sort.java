package com.example;

public abstract class Sort {
    //bubble sort
    public static void bubbleSort(int[] list){
        //if an element is greater than the next element, it bubbles up until it reaches an element greater than it, or the end ofthe list
        boolean unsorted = true;

        while (unsorted){
            unsorted = false;
            for (int j = 0; j < list.length-1; j++){
                //we will loop through the list and for each element, if an element is greater than the next element, swap it
                if (list[j] > list[j+1]){
                    unsorted = true;
                    // int temp = list[j];
                    // list[j] = list[j+1];
                    // list[j+1] = temp;

                    swap(list, j, j+1);
                }
            }
        }
    }

    //selection sort
    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length; i++){
            int last_unsorted = list.length - 1 - i;
            int largest_index = 0;
            for (int j = 0; j <= last_unsorted; j++){
                if (list[j] > list[largest_index]){
                    largest_index = j;
                }
            }
            if (largest_index != last_unsorted){
                // int temp = list[last_unsorted];
                // list[last_unsorted] = list[largest_index];
                // list[largest_index] = temp;
                swap(list, last_unsorted, largest_index);
            }
        }
    }

    //insertion sort
    public static void insertionSort(int[] list){
        //we will loop through the list.
        //for each item, we will move it

        for (int i = 1; i < list.length; i++){
            // int unsorted_start = i;
            boolean sorted = false;

            int current_index = i;
            while (!sorted) {
                if (list[current_index] < list[current_index-1]){
                    // int temp = list[current_index];
                    // list[current_index] = list[current_index-1];
                    // list[current_index-1] = temp;
                    swap(list, current_index, current_index-1);
                    current_index = current_index - 1;
                    if (current_index == 0){
                        sorted = true;
                    }
                }
                else{
                    sorted = true;
                }
            }
        }

    }

    //merge sort
    public static void mergeSort(int[] list){
        int start = 0;
        int end = list.length - 1;

        mergeSort(list, start, end);

    }

    public static void mergeSort(int[] list, int start, int end){
        //first we split the list along a midpoint
        if (start >= end){
            return;
        }

        int mid = start + (end - start) / 2;

        int left_start = start;
        int left_end = mid;

        int right_start = mid + 1;
        int right_end = end;

        mergeSort(list, left_start, left_end);
        mergeSort(list, right_start, right_end);

        merge(list, left_start, left_end, right_start, right_end);

    }

    public static void merge(int[] list, int left_start, int left_end, int right_start, int right_end){
        int[] merged_list = new int[list.length];

        int left_index = left_start;
        int right_index = right_start;
        int merged_index = left_start;

        while (left_index <= left_end && right_index <= right_end){
            if (list[left_index] < list[right_index]){
                merged_list[merged_index] = list[left_index];
                left_index ++;
                merged_index ++;
            }
            else{
                merged_list[merged_index] = list[right_index];
                right_index ++;
                merged_index ++;
            }
            
        }

        while (left_index <= left_end) {
            merged_list[merged_index] = list[left_index];
            merged_index ++;
            left_index ++;
        }
        while (right_index <= right_end){
            merged_list[merged_index] = list[right_index];
            merged_index ++;
            right_index ++;
        }

        for (int i = left_start; i <= right_end; i++){

            list[i] = merged_list[i];
        }

    }

    //quick sort
    public static void quickSort(int[] list){
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int start, int end){
        if (end <= start){
            return;
        }

        int pivot = start +  (end - start)/2;
        swap(list, end, pivot);
        pivot = end;


        int front_index = start;
        int back_index = end - 1;        
        
        

        while (front_index < back_index){
            while (front_index < pivot && list[front_index] < list[pivot] ) {
                //from the front, find the next element that is greater than or equal to the pivot.
                //if the current element is not greater than or equal to the pivot, increment the index until you reach the end
                front_index ++;
            }
    
            boolean in_order = false;
            if (front_index == pivot){
                in_order = true;
            }
    
            if (! in_order){
                while (back_index > start && list[back_index] >= list[pivot] ) {
                    //from the back, find the next element that is less than the pivot.
                    //if the current element is not less than the pivot, decrement the index until you reach the beginning
                    back_index --;
                }
                swap(list, front_index, back_index);
                front_index ++;
                back_index --;
                // if (back_index > front_index) {
                //     swap(list, front_index, back_index);
                //     // front_index ++;
                //     // back_index --;
                // }
                // else if (back_index <= front_index)
                // {
                //     break;
                // }
            }
        }
        swap(list, front_index, pivot);
        


        quickSort(list, start, pivot - 1);
        quickSort(list, pivot + 1, end);

    }

    public static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
