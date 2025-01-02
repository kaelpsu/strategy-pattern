package com.strategypattern.app;
import com.strategypattern.app.strategies.SearchStrategy;

// InventorySearchContext class
public class InventorySearchContext {
    private SearchStrategy strategy;

    public InventorySearchContext(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public int search(int[] array, int key) {
        return strategy.search(array, key);
    }
}
