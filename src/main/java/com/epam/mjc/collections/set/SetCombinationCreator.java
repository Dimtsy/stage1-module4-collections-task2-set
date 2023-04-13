package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        for (String value : firstSet) {
            if (secondSet.contains(value)) {
                if (!thirdSet.contains(value)) {
                    set.add(value);
                }
            }
        }
        for (String value : thirdSet) {
            if (!secondSet.contains(value)) {
                if (!firstSet.contains(value)) {
                    set.add(value);
                }
            }
        }
        return set;
    }
}
