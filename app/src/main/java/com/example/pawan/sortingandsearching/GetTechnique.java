package com.example.pawan.sortingandsearching;

import java.util.ArrayList;

/**
 * Created by Pawan on 27-11-2017.
 */

public class GetTechnique {
    public static ArrayList<Technique> getSortingTechnique(){
        ArrayList<Technique> result = new ArrayList<>();
        result.add(new Technique("Selection Sort",Constants.selection_sort));
        result.add(new Technique("Bubble Sort",Constants.bubble_sort));
        result.add(new Technique("Insertion Sort",Constants.insertion_sort));
        result.add(new Technique("Merge Sort",Constants.merge_sort));
        result.add(new Technique("Quick Sort",Constants.quick_sort));
        result.add(new Technique("Heap Sort",Constants.heap_sort));
        result.add(new Technique("Count Sort",Constants.count_sort));
        result.add(new Technique("Radix Sort",Constants.radix_sort));
        result.add(new Technique("Bucket Sort",Constants.bucket_sort));
        result.add(new Technique("Shell Sort",Constants.shell_sort));
        return result;
    }
    public static ArrayList<Technique> getSearchingTechnique(){
        ArrayList<Technique> result = new ArrayList<>();
        result.add(new Technique("Linear Search",Constants.linear_search));
        result.add(new Technique("Binary Search",Constants.binary_search));
        result.add(new Technique("Jump Search",Constants.jump_search));
        result.add(new Technique("Interpolation Search",Constants.interpolation_search));
        result.add(new Technique("Exponential Search",Constants.exponential_search));
        result.add(new Technique("Fibonacci Search",Constants.fibonacci_search));
        return result;
    }
}
