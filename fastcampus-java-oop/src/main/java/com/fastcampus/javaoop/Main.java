package com.fastcampus.javaoop;
import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.Sort;

<<<<<<< Updated upstream
import java.util.ArrayList;
import com.fastcampus.javaoop.logic.Sort;

=======
>>>>>>> Stashed changes
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
<<<<<<< Updated upstream
=======
        Sort<String> sort = new BubbleSort<>();
>>>>>>> Stashed changes

        Sort<String> sort = new BubbleSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
