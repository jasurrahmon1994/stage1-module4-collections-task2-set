package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            Integer temp = sourceList.get(i);
            if(temp % 2 != 0){
                res.add(temp);
                res.add(2 * temp);
            } else {
                res.add(temp);
                while(temp % 2 == 0){
                    res.add(temp / 2);
                    temp = temp / 2;
                }
            }
        }
        return res;
    }
}
