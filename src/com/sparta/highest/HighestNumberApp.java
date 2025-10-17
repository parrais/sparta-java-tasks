package com.sparta.highest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestNumberApp {
    static void main() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 12, 7, 19, 3, 42, 8, 16, 27, 33,
                4, 9, 21, 11, 6, 25, 14, 2, 18, 30));
        System.out.println(getSecondHighestInt(numbers));
    }
    private static int getSecondHighestInt(List inputNumbers){
        List<Integer> sortingList = new ArrayList<Integer>(inputNumbers);
        Collections.sort(sortingList);
        Collections.reverse(sortingList);
        return sortingList.get(1);
    }
}
