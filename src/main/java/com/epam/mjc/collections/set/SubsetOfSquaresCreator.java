package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> res = new TreeSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            Integer temp = sourceList.get(i);
            res.add(temp * temp);
        }
        return res.subSet(lowerBound, true, upperBound, true);
    }
}
