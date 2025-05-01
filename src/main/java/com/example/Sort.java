package com.example;

public abstract class Sort {
    //bubble sort
    public static void bubbleSort(int[] list){
        //if an element is greater than the next element, it bubbles up until it reaches an element greater than it, or the end ofthe list
        boolean is_unsorted = true; 
        int unsorted_list_end = list.length - 1; //last unsorted element in the array

        while (is_unsorted){
            is_unsorted = false; //assume that the list is sorted until you find an element out of place
            for (int i = 0; i < unsorted_list_end; i++){
                //we will loop through the list and if an element is out of place, 
                //consider the list unsorted and swap it with the next element
                if (list[i] > list[i+1]){ // i
                    is_unsorted = true;
                    swap(list, i, i+1);
                }
            }
            //update the index of the last unsorted item in the array
            unsorted_list_end -= 1;
        }
    }

    //selection sort
    public static void selectionSort(int[] list){
        //select the largest value in the list and move it to the end of the unsorted list. keep doing this until the list is sorted
        
        int unsorted_list_end = list.length - 1; //set the end of the unsorted list to be the end of the list

        for (int i = 0; i < list.length; i++){
            //repeat this for as long as the list is
            int largest_index = unsorted_list_end; // assume that the value at the end of the list is the largest value
            for (int j = 0; j < unsorted_list_end; j++){
                //loop through the unsorted list looking for the largest value. 
                //set the value of the largest index to the value of the largest index
                if (list[j] > list[largest_index]){
                    largest_index = j;
                }
            }
            if (largest_index != unsorted_list_end){
                swap(list, unsorted_list_end, largest_index);
            }
            unsorted_list_end -= 1;
        }
    }

    //insertion sort
    public static void insertionSort(int[] list){
        //Select an element and insert it in the correct position of the sorted list
        
        int end = list.length - 2; // assume that the last value is sorted 

        for (int i = 1; i < list.length; i++){
            for (int j = end; j >= 0; j--){
                if(list[j] > list[j+1]){
                    swap(list, j, j+1);
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

        int pivot = start + (end - start)/2;
        swap(list, pivot, end);
        pivot = end;

        int left_bigger = start -1;
        int right_smaller = pivot;

        while (true) {
            for (int i = left_bigger + 1; i <= pivot; i ++){
                if (list[i] > list[pivot]){
                    left_bigger = i;
                    break;
                }
            }
            if (left_bigger < start){
                return;
            }
    
            
            for (int i = right_smaller-1; i >= start; i --){
                if(list[i] < list[pivot]){
                    right_smaller = i;
                    break;
                }
            }
            
            if (right_smaller == pivot || left_bigger >= right_smaller){
                // swap(list, left_bigger, pivot);
                // pivot = left_bigger;
                break;
            }

            // if (left_bigger >= right_smaller){
            //     // swap(list, left_bigger, pivot);
            //     // pivot = left_bigger;
            //     break;
            // }

            swap(list, left_bigger, right_smaller);
        }

        swap(list, left_bigger, pivot);
        pivot = left_bigger;

        quickSort(list, start, pivot - 1);
        quickSort(list, pivot + 1, end);   













        // if (end <= start){
        //     return;
        // }

        // int pivot = start +  (end - start)/2;
        // swap(list, end, pivot);
        // pivot = end;


        // int front_index = start;
        // int back_index = end - 1;        
        
        

        // while (front_index < back_index){
        //     while (front_index < pivot && list[front_index] < list[pivot] ) {
        //         //from the front, find the next element that is greater than or equal to the pivot.
        //         //if the current element is not greater than or equal to the pivot, increment the index until you reach the end
        //         front_index ++;
        //     }
    
        //     boolean in_order = false;
        //     if (front_index == pivot){
        //         in_order = true;
        //     }
    
        //     if (! in_order){
        //         while (back_index > start && list[back_index] >= list[pivot] ) {
        //             //from the back, find the next element that is less than the pivot.
        //             //if the current element is not less than the pivot, decrement the index until you reach the beginning
        //             back_index --;
        //         }
        //         swap(list, front_index, back_index);
        //         front_index ++;
        //         back_index --;
        //         // if (back_index > front_index) {
        //         //     swap(list, front_index, back_index);
        //         //     // front_index ++;
        //         //     // back_index --;
        //         // }
        //         // else if (back_index <= front_index)
        //         // {
        //         //     break;
        //         // }
        //     }
        // }
        // swap(list, front_index, pivot);
        


        // quickSort(list, start, pivot - 1);
        // quickSort(list, pivot + 1, end);

    }

    public static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
