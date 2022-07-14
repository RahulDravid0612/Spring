package com.example.Spring.Spring.basic;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Component
public class BinarySearchImpl { ///BinarySearch algorithm depends on SortAlgorithm

   private Logger logger= (Logger) LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor){
       int[] sortNumbers=sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }
}
