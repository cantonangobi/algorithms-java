package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] list = {7, 1, 5, 8, 4, 9, 2, 6, 3};
        // int[] list = {1, 2, 3, 4, 5};
        // System.err.println(list.length);

        System.out.println("Length: " + Basic.getLength(list));
        Basic.printList(list);

        Sort.selectionSort(list);

        Basic.printList(list);

        int[] list2 = {7, 2, 6, 4, 1, 5, 6, 2};

        System.out.println("Length: " + Basic.getLength(list2));
        Basic.printList(list2);

        Sort.selectionSort(list2);

        Basic.printList(list2);

        
        // int[] sorted_list = Sort.selectionSort(list);

        // Basic.printList(sorted_list);

        // int[] list2 = {1, 2, 6, 4, 5, 6};

        // System.out.println("Length: " + Basic.getLength(list2));
        // Basic.printList(list2);

        // sorted_list = Sort.selectionSort(list2);

        // Basic.printList(sorted_list);

        // int[] sorted_list = Sort.insertionSort(list);

        // Basic.printList(sorted_list);

        // int[] list2 = {1, 2, 6, 4, 5, 6};

        // System.out.println("Length: " + Basic.getLength(list2));
        // Basic.printList(list2);

        // sorted_list = Sort.insertionSort(list2);

        // Basic.printList(sorted_list);


        // Basic.printList(sorted_list);

        // Sort.mergeSort(list);

        // Basic.printList(list);

        // int[] list2 = {1, 2, 6, 4, 5, 6};

        // System.out.println("Length: " + Basic.getLength(list2));
        // Basic.printList(list2);

        // Sort.mergeSort(list2);

        // Basic.printList(list2);
        
        // System.out.println("\nLinear search - Index Of");
        // System.out.println(Search.indexOfLinear(3, list));
        // System.out.println(Search.indexOfLinear(1, list));
        // System.out.println(Search.indexOfLinear(5, list));
        // System.out.println(Search.indexOfLinear(0, list));
        // System.out.println(Search.indexOfLinear(6, list));

        // System.out.println("\nLinear search - Contains");
        // System.out.println(Search.containsLinear(3, list));
        // System.out.println(Search.containsLinear(1, list));
        // System.out.println(Search.containsLinear(5, list));
        // System.out.println(Search.containsLinear(0, list));
        // System.out.println(Search.containsLinear(6, list));
        
        // System.out.println("\nBinary search - Index Of");
        // System.out.println(Search.indexOfBinary(3, list));
        // System.out.println(Search.indexOfBinary(1, list));
        // System.out.println(Search.indexOfBinary(5, list));
        // System.out.println(Search.indexOfBinary(0, list));
        // System.out.println(Search.indexOfBinary(6, list));

        // System.out.println("\nBinary search - Contains");
        // System.out.println(Search.containsBinary(3, list));
        // System.out.println(Search.containsBinary(1, list));
        // System.out.println(Search.containsBinary(5, list));
        // System.out.println(Search.containsBinary(0, list));
        // System.out.println(Search.containsBinary(6, list));

        // System.out.println("\nBinary search, recursive - Index Of");
        // System.out.println(Search.indexOfBinaryRecursive(3, list));
        // System.out.println(Search.indexOfBinaryRecursive(1, list));
        // System.out.println(Search.indexOfBinaryRecursive(5, list));
        // System.out.println(Search.indexOfBinaryRecursive(0, list));
        // System.out.println(Search.indexOfBinaryRecursive(6, list));
        
        // System.out.println("\nBinary search, recursive - Contains");
        // System.out.println(Search.containsBinary(3, list));
        // System.out.println(Search.containsBinary(1, list));
        // System.out.println(Search.containsBinary(5, list));
        // System.out.println(Search.containsBinary(0, list));
        // System.out.println(Search.containsBinary(6, list));
    }
}