package com.example.Spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl { ///BinarySearch algorithm depends on SortAlgorithm
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
       int[] sortNumbers=sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
