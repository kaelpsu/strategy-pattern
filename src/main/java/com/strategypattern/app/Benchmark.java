package com.strategypattern.app;
import java.util.Arrays;

import com.strategypattern.app.strategies.BinarySearchStrategy;
import com.strategypattern.app.strategies.LinearSearchStrategy;

public class Benchmark {
    public static void main(String[] args) {
        int[] productCodes = {1001, 1005, 1010, 1020, 1030, 1040}; // Sample sorted array

        // Using Linear Search Strategy
        InventorySearchContext context = new InventorySearchContext(new LinearSearchStrategy());
        int result = context.search(productCodes, 1010);
        System.out.println("Linear Search Result: " + (result != -1 ? "Found at index " + result : "Not Found"));

        // Using Binary Search Strategy
        context.setStrategy(new BinarySearchStrategy());
        result = context.search(productCodes, 1010);
        System.out.println("Binary Search Result: " + (result != -1 ? "Found at index " + result : "Not Found"));

        // Performance Test
        int[] largeArray = new int[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }
        int[] array50 = Arrays.copyOfRange(largeArray, 0, 49);
        int[] array5000 = Arrays.copyOfRange(largeArray, 0, 4999);
        int[] array100000 = Arrays.copyOfRange(largeArray, 0, 99999);

        // Performance Test for 50 elements
        int key50 = 49;

        long startTime = System.nanoTime();
        context.setStrategy(new LinearSearchStrategy());
        context.search(array50, key50);
        long endTime = System.nanoTime();
        System.out.println("Linear Search Time for 50 elements: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        context.setStrategy(new BinarySearchStrategy());
        context.search(array50, key50);
        endTime = System.nanoTime();
        System.out.println("Binary Search Time for 50 elements: " + (endTime - startTime) + " ns");

        // Performance Test for 5000 elements
        int key5000 = 4999;

        startTime = System.nanoTime();
        context.setStrategy(new LinearSearchStrategy());
        context.search(array5000, key5000);
        endTime = System.nanoTime();
        System.out.println("Linear Search Time for 5000 elements: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        context.setStrategy(new BinarySearchStrategy());
        context.search(array5000, key5000);
        endTime = System.nanoTime();
        System.out.println("Binary Search Time for 5000 elements: " + (endTime - startTime) + " ns");

        // Performance Test for 100000 elements
        int key100000 = 99999;

        startTime = System.nanoTime();
        context.setStrategy(new LinearSearchStrategy());
        context.search(array100000, key100000);
        endTime = System.nanoTime();
        System.out.println("Linear Search Time for 100000 elements: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        context.setStrategy(new BinarySearchStrategy());
        context.search(array100000, key100000);
        endTime = System.nanoTime();
        System.out.println("Binary Search Time for 100000 elements: " + (endTime - startTime) + " ns");


        // Performance Test for 1000000 elements
        int key = 999999; // Key to search for

        startTime = System.nanoTime();
        context.setStrategy(new LinearSearchStrategy());
        context.search(largeArray, key);
        endTime = System.nanoTime();
        System.out.println("Linear Search Time for 1000000 elements: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        context.setStrategy(new BinarySearchStrategy());
        context.search(largeArray, key);
        endTime = System.nanoTime();
        System.out.println("Binary Search Time for 1000000 elements: " + (endTime - startTime) + " ns");
        
    }
}