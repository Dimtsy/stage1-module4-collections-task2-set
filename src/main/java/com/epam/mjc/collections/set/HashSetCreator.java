package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer value : sourceList) {
            if (value % 2 == 0) {
                while (value % 2 == 0) {
                    hashSet.add(value);
                    value = value / 2;
                }
                hashSet.add(value);
            } else {
                hashSet.add(value);
                hashSet.add(value * 2);
            }
        }
        return hashSet;
    }
}
