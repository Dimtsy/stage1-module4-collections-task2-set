package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (Integer value : sourceList) {
            navigableSet.add((int) Math.pow(value, 2));
        }
        return navigableSet.subSet(lowerBound, true, upperBound, true);
    }
}
