package com.devskiller.operation;

import com.devskiller.exception.IntegerOverflowException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOperation {

    public int sumInts(List<String> input) throws IntegerOverflowException {
        if(null==input || input.isEmpty()) return 0;
        List<Integer> listToSum = new ArrayList<>();
        int sum=0;

        for(String value:input){
            String lineResult= extractInt(value);
           if(!lineResult.isEmpty())
            listToSum.addAll(Arrays.asList(lineResult.split(" ")).stream().map(Integer::valueOf).collect(Collectors.toList()));
        }

        if(!listToSum.isEmpty()) {
         sum= listToSum.stream().reduce((a, b) -> a + b).get();
        }
        return sum;
    }

    static String extractInt(String str)
    {
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        return str;
    }

}
