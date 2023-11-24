package com.fastcampus.javaoop;
import com.fastcampus.javaoop.logic.BubbleSort;
import java.util.ArrayList;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();
        Sort<String> sort = new BubbleSort<>();
      
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
