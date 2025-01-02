package com.strategypattern.app.strategies;

// Linear search implementation
public class LinearSearchStrategy implements SearchStrategy {
    @Override
    public int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
