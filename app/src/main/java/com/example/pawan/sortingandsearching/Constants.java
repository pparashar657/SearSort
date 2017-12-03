package com.example.pawan.sortingandsearching;

/**
 * Created by Pawan on 03-12-2017.
 */

public class Constants {

    public static final String selection_sort = "void sort(int arr[])\n" +
            "    {\n" +
            "        int n = arr.length;\n" +
            " \n" +
            "        // One by one move boundary of unsorted subarray\n" +
            "        for (int i = 0; i < n-1; i++)\n" +
            "        {\n" +
            "            // Find the minimum element in unsorted array\n" +
            "            int min_idx = i;\n" +
            "            for (int j = i+1; j < n; j++)\n" +
            "                if (arr[j] < arr[min_idx])\n" +
            "                    min_idx = j;\n" +
            " \n" +
            "            // Swap the found minimum element with the first\n" +
            "            // element\n" +
            "            int temp = arr[min_idx];\n" +
            "            arr[min_idx] = arr[i];\n" +
            "            arr[i] = temp;\n" +
            "        }\n" +
            "    }";

    public static final String bubble_sort = "void bubbleSort(int arr[])\n" +
            "    {\n" +
            "        int n = arr.length;\n" +
            "        for (int i = 0; i < n-1; i++)\n" +
            "            for (int j = 0; j < n-i-1; j++)\n" +
            "                if (arr[j] > arr[j+1])\n" +
            "                {\n" +
            "                    // swap temp and arr[i]\n" +
            "                    int temp = arr[j];\n" +
            "                    arr[j] = arr[j+1];\n" +
            "                    arr[j+1] = temp;\n" +
            "                }\n" +
            "    }";

    public static final String insertion_sort = "void insertionSort(int arr[], int n)\n" +
            "{\n" +
            "   int i, key, j;\n" +
            "   for (i = 1; i < n; i++)\n" +
            "   {\n" +
            "       key = arr[i];\n" +
            "       j = i-1;\n" +
            " \n" +
            "       /* Move elements of arr[0..i-1], that are\n" +
            "          greater than key, to one position ahead\n" +
            "          of their current position */\n" +
            "       while (j >= 0 && arr[j] > key)\n" +
            "       {\n" +
            "           arr[j+1] = arr[j];\n" +
            "           j = j-1;\n" +
            "       }\n" +
            "       arr[j+1] = key;\n" +
            "   }\n" +
            "}";

    public static final String merge_sort = "void merge(int arr[], int l, int m, int r)\n" +
            "    {\n" +
            "        // Find sizes of two subarrays to be merged\n" +
            "        int n1 = m - l + 1;\n" +
            "        int n2 = r - m;\n" +
            " \n" +
            "        /* Create temp arrays */\n" +
            "        int L[] = new int [n1];\n" +
            "        int R[] = new int [n2];\n" +
            " \n" +
            "        /*Copy data to temp arrays*/\n" +
            "        for (int i=0; i<n1; ++i)\n" +
            "            L[i] = arr[l + i];\n" +
            "        for (int j=0; j<n2; ++j)\n" +
            "            R[j] = arr[m + 1+ j];\n" +
            " \n" +
            " \n" +
            "        /* Merge the temp arrays */\n" +
            " \n" +
            "        // Initial indexes of first and second subarrays\n" +
            "        int i = 0, j = 0;\n" +
            " \n" +
            "        // Initial index of merged subarry array\n" +
            "        int k = l;\n" +
            "        while (i < n1 && j < n2)\n" +
            "        {\n" +
            "            if (L[i] <= R[j])\n" +
            "            {\n" +
            "                arr[k] = L[i];\n" +
            "                i++;\n" +
            "            }\n" +
            "            else\n" +
            "            {\n" +
            "                arr[k] = R[j];\n" +
            "                j++;\n" +
            "            }\n" +
            "            k++;\n" +
            "        }\n" +
            " \n" +
            "        /* Copy remaining elements of L[] if any */\n" +
            "        while (i < n1)\n" +
            "        {\n" +
            "            arr[k] = L[i];\n" +
            "            i++;\n" +
            "            k++;\n" +
            "        }\n" +
            " \n" +
            "        /* Copy remaining elements of R[] if any */\n" +
            "        while (j < n2)\n" +
            "        {\n" +
            "            arr[k] = R[j];\n" +
            "            j++;\n" +
            "            k++;\n" +
            "        }\n" +
            "    }\n" +
            " \n" +
            "    // Main function that sorts arr[l..r] using\n" +
            "    // merge()\n" +
            "    void sort(int arr[], int l, int r)\n" +
            "    {\n" +
            "        if (l < r)\n" +
            "        {\n" +
            "            // Find the middle point\n" +
            "            int m = (l+r)/2;\n" +
            " \n" +
            "            // Sort first and second halves\n" +
            "            sort(arr, l, m);\n" +
            "            sort(arr , m+1, r);\n" +
            " \n" +
            "            // Merge the sorted halves\n" +
            "            merge(arr, l, m, r);\n" +
            "        }\n" +
            "    }";


    public static final String quick_sort = "int partition(int arr[], int low, int high)\n" +
            "    {\n" +
            "        int pivot = arr[high]; \n" +
            "        int i = (low-1); // index of smaller element\n" +
            "        for (int j=low; j<high; j++)\n" +
            "        {\n" +
            "            // If current element is smaller than or\n" +
            "            // equal to pivot\n" +
            "            if (arr[j] <= pivot)\n" +
            "            {\n" +
            "                i++;\n" +
            " \n" +
            "                // swap arr[i] and arr[j]\n" +
            "                int temp = arr[i];\n" +
            "                arr[i] = arr[j];\n" +
            "                arr[j] = temp;\n" +
            "            }\n" +
            "        }\n" +
            " \n" +
            "        // swap arr[i+1] and arr[high] (or pivot)\n" +
            "        int temp = arr[i+1];\n" +
            "        arr[i+1] = arr[high];\n" +
            "        arr[high] = temp;\n" +
            " \n" +
            "        return i+1;\n" +
            "    }\n" +
            " \n" +
            " \n" +
            "    /* The main function that implements QuickSort()\n" +
            "      arr[] --> Array to be sorted,\n" +
            "      low  --> Starting index,\n" +
            "      high  --> Ending index */\n" +
            "    void sort(int arr[], int low, int high)\n" +
            "    {\n" +
            "        if (low < high)\n" +
            "        {\n" +
            "            /* pi is partitioning index, arr[pi] is \n" +
            "              now at right place */\n" +
            "            int pi = partition(arr, low, high);\n" +
            " \n" +
            "            // Recursively sort elements before\n" +
            "            // partition and after partition\n" +
            "            sort(arr, low, pi-1);\n" +
            "            sort(arr, pi+1, high);\n" +
            "        }\n" +
            "    }";

    public static final String heap_sort = "public void sort(int arr[])\n" +
            "    {\n" +
            "        int n = arr.length;\n" +
            " \n" +
            "        // Build heap (rearrange array)\n" +
            "        for (int i = n / 2 - 1; i >= 0; i--)\n" +
            "            heapify(arr, n, i);\n" +
            " \n" +
            "        // One by one extract an element from heap\n" +
            "        for (int i=n-1; i>=0; i--)\n" +
            "        {\n" +
            "            // Move current root to end\n" +
            "            int temp = arr[0];\n" +
            "            arr[0] = arr[i];\n" +
            "            arr[i] = temp;\n" +
            " \n" +
            "            // call max heapify on the reduced heap\n" +
            "            heapify(arr, i, 0);\n" +
            "        }\n" +
            "    }\n" +
            " \n" +
            "    // To heapify a subtree rooted with node i which is\n" +
            "    // an index in arr[]. n is size of heap\n" +
            "    void heapify(int arr[], int n, int i)\n" +
            "    {\n" +
            "        int largest = i;  // Initialize largest as root\n" +
            "        int l = 2*i + 1;  // left = 2*i + 1\n" +
            "        int r = 2*i + 2;  // right = 2*i + 2\n" +
            " \n" +
            "        // If left child is larger than root\n" +
            "        if (l < n && arr[l] > arr[largest])\n" +
            "            largest = l;\n" +
            " \n" +
            "        // If right child is larger than largest so far\n" +
            "        if (r < n && arr[r] > arr[largest])\n" +
            "            largest = r;\n" +
            " \n" +
            "        // If largest is not root\n" +
            "        if (largest != i)\n" +
            "        {\n" +
            "            int swap = arr[i];\n" +
            "            arr[i] = arr[largest];\n" +
            "            arr[largest] = swap;\n" +
            " \n" +
            "            // Recursively heapify the affected sub-tree\n" +
            "            heapify(arr, n, largest);\n" +
            "        }\n" +
            "    }";

    public static final String count_sort = "void sort(char arr[])\n" +
            "    {\n" +
            "        int n = arr.length;\n" +
            "\n" +
            "        // The output character array that will have sorted arr\n" +
            "        char output[] = new char[n];\n" +
            "\n" +
            "        // Create a count array to store count of inidividul\n" +
            "        // characters and initialize count array as 0\n" +
            "        int count[] = new int[256];\n" +
            "        for (int i=0; i<256; ++i)\n" +
            "            count[i] = 0;\n" +
            "\n" +
            "        // store count of each character\n" +
            "        for (int i=0; i<n; ++i)\n" +
            "            ++count[arr[i]];\n" +
            "\n" +
            "        // Change count[i] so that count[i] now contains actual\n" +
            "        // position of this character in output array\n" +
            "        for (int i=1; i<=255; ++i)\n" +
            "            count[i] += count[i-1];\n" +
            "\n" +
            "        // Build the output character array\n" +
            "        for (int i = 0; i<n; ++i)\n" +
            "        {\n" +
            "            output[count[arr[i]]-1] = arr[i];\n" +
            "            --count[arr[i]];\n" +
            "        }\n" +
            "\n" +
            "        // Copy the output array to arr, so that arr now\n" +
            "        // contains sorted characters\n" +
            "        for (int i = 0; i<n; ++i)\n" +
            "            arr[i] = output[i];\n" +
            "    }";

    public static final String radix_sort = "static int getMax(int arr[], int n)\n" +
            "    {\n" +
            "        int mx = arr[0];\n" +
            "        for (int i = 1; i < n; i++)\n" +
            "            if (arr[i] > mx)\n" +
            "                mx = arr[i];\n" +
            "        return mx;\n" +
            "    }\n" +
            " \n" +
            "    // A function to do counting sort of arr[] according to\n" +
            "    // the digit represented by exp.\n" +
            "    static void countSort(int arr[], int n, int exp)\n" +
            "    {\n" +
            "        int output[] = new int[n]; // output array\n" +
            "        int i;\n" +
            "        int count[] = new int[10];\n" +
            "        Arrays.fill(count,0);\n" +
            " \n" +
            "        // Store count of occurrences in count[]\n" +
            "        for (i = 0; i < n; i++)\n" +
            "            count[ (arr[i]/exp)%10 ]++;\n" +
            " \n" +
            "        // Change count[i] so that count[i] now contains\n" +
            "        // actual position of this digit in output[]\n" +
            "        for (i = 1; i < 10; i++)\n" +
            "            count[i] += count[i - 1];\n" +
            " \n" +
            "        // Build the output array\n" +
            "        for (i = n - 1; i >= 0; i--)\n" +
            "        {\n" +
            "            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];\n" +
            "            count[ (arr[i]/exp)%10 ]--;\n" +
            "        }\n" +
            " \n" +
            "        // Copy the output array to arr[], so that arr[] now\n" +
            "        // contains sorted numbers according to curent digit\n" +
            "        for (i = 0; i < n; i++)\n" +
            "            arr[i] = output[i];\n" +
            "    }\n" +
            " \n" +
            "    // The main function to that sorts arr[] of size n using\n" +
            "    // Radix Sort\n" +
            "    static void radixsort(int arr[], int n)\n" +
            "    {\n" +
            "        // Find the maximum number to know number of digits\n" +
            "        int m = getMax(arr, n);\n" +
            " \n" +
            "        // Do counting sort for every digit. Note that instead\n" +
            "        // of passing digit number, exp is passed. exp is 10^i\n" +
            "        // where i is current digit number\n" +
            "        for (int exp = 1; m/exp > 0; exp *= 10)\n" +
            "            countSort(arr, n, exp);\n" +
            "    }";

    public static final String bucket_sort = "void bucketSort(float arr[], int n)\n" +
            "{\n" +
            "    // 1) Create n empty buckets\n" +
            "    vector<float> b[n];\n" +
            "   \n" +
            "    // 2) Put array elements in different buckets\n" +
            "    for (int i=0; i<n; i++)\n" +
            "    {\n" +
            "       int bi = n*arr[i]; // Index in bucket\n" +
            "       b[bi].push_back(arr[i]);\n" +
            "    }\n" +
            "\n" +
            "    // 3) Sort individual buckets\n" +
            "    for (int i=0; i<n; i++)\n" +
            "       sort(b[i].begin(), b[i].end());\n" +
            "\n" +
            "    // 4) Concatenate all buckets into arr[]\n" +
            "    int index = 0;\n" +
            "    for (int i = 0; i < n; i++)\n" +
            "        for (int j = 0; j < b[i].size(); j++)\n" +
            "          arr[index++] = b[i][j];\n" +
            "}\n";

    public static final String shell_sort = "int sort(int arr[])\n" +
            "    {\n" +
            "        int n = arr.length;\n" +
            "\n" +
            "        // Start with a big gap, then reduce the gap\n" +
            "        for (int gap = n/2; gap > 0; gap /= 2)\n" +
            "        {\n" +
            "            // Do a gapped insertion sort for this gap size.\n" +
            "            // The first gap elements a[0..gap-1] are already\n" +
            "            // in gapped order keep adding one more element\n" +
            "            // until the entire array is gap sorted\n" +
            "            for (int i = gap; i < n; i += 1)\n" +
            "            {\n" +
            "                // add a[i] to the elements that have been gap\n" +
            "                // sorted save a[i] in temp and make a hole at\n" +
            "                // position i\n" +
            "                int temp = arr[i];\n" +
            "\n" +
            "                // shift earlier gap-sorted elements up until\n" +
            "                // the correct location for a[i] is found\n" +
            "                int j;\n" +
            "                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)\n" +
            "                    arr[j] = arr[j - gap];\n" +
            "\n" +
            "                // put temp (the original a[i]) in its correct\n" +
            "                // location\n" +
            "                arr[j] = temp;\n" +
            "            }\n" +
            "        }\n" +
            "        return 0;\n" +
            "    }";

    public static final String tim_sort = "void timSort(int arr[], int n)\n" +
            "{\n" +
            "    // Sort individual subarrays of size RUN\n" +
            "    for (int i = 0; i < n; i+=RUN)\n" +
            "        insertionSort(arr, i, min((i+31), (n-1)));\n" +
            "\n" +
            "    // start merging from size RUN (or 32). It will merge\n" +
            "    // to form size 64, then 128, 256 and so on ....\n" +
            "    for (int size = RUN; size < n; size = 2*size)\n" +
            "    {\n" +
            "        // pick starting point of left sub array. We\n" +
            "        // are going to merge arr[left..left+size-1]\n" +
            "        // and arr[left+size, left+2*size-1]\n" +
            "        // After every merge, we increase left by 2*size\n" +
            "        for (int left = 0; left < n; left += 2*size)\n" +
            "        {\n" +
            "            // find ending point of left sub array\n" +
            "            // mid+1 is starting point of right sub array\n" +
            "            int mid = left + size - 1;\n" +
            "            int right = min((left + 2*size - 1), (n-1));\n" +
            "\n" +
            "            // merge sub array arr[left.....mid] &\n" +
            "            // arr[mid+1....right]\n" +
            "            merge(arr, left, mid, right);\n" +
            "        }\n" +
            "    }\n" +
            "}";

    public static final String comb_sort = "int getNextGap(int gap)\n" +
            "    {\n" +
            "        // Shrink gap by Shrink factor\n" +
            "        gap = (gap*10)/13;\n" +
            "        if (gap < 1)\n" +
            "            return 1;\n" +
            "        return gap;\n" +
            "    }\n" +
            "\n" +
            "    // Function to sort arr[] using Comb Sort\n" +
            "    void sort(int arr[])\n" +
            "    {\n" +
            "        int n = arr.length;\n" +
            "\n" +
            "        // initialize gap\n" +
            "        int gap = n;\n" +
            "\n" +
            "        // Initialize swapped as true to make sure that\n" +
            "        // loop runs\n" +
            "        boolean swapped = true;\n" +
            "\n" +
            "        // Keep running while gap is more than 1 and last\n" +
            "        // iteration caused a swap\n" +
            "        while (gap != 1 || swapped == true)\n" +
            "        {\n" +
            "            // Find next gap\n" +
            "            gap = getNextGap(gap);\n" +
            "\n" +
            "            // Initialize swapped as false so that we can\n" +
            "            // check if swap happened or not\n" +
            "            swapped = false;\n" +
            "\n" +
            "            // Compare all elements with current gap\n" +
            "            for (int i=0; i<n-gap; i++)\n" +
            "            {\n" +
            "                if (arr[i] > arr[i+gap])\n" +
            "                {\n" +
            "                    // Swap arr[i] and arr[i+gap]\n" +
            "                    int temp = arr[i];\n" +
            "                    arr[i] = arr[i+gap];\n" +
            "                    arr[i+gap] = temp;\n" +
            "\n" +
            "                    // Set swapped\n" +
            "                    swapped = true;\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }";

    public static final String pigeonhole_sort = "public static void pigeonhole_sort(int arr[],\n" +
            "                                           int n)\n" +
            "    {\n" +
            "        int min = arr[0];\n" +
            "        int max = arr[0];\n" +
            "        int range, i, j, index; \n" +
            "\n" +
            "        for(int a=0; a<n; a++)\n" +
            "        {\n" +
            "            if(arr[a] > max)\n" +
            "                max = arr[a];\n" +
            "            if(arr[a] < min)\n" +
            "                min = arr[a];\n" +
            "        }\n" +
            "\n" +
            "        range = max - min + 1;\n" +
            "        int[] phole = new int[range];\n" +
            "        Arrays.fill(phole, 0);\n" +
            "\n" +
            "        for(i = 0; i<n; i++)\n" +
            "            phole[arr[i] - min]++;\n" +
            "\n" +
            "        \n" +
            "        index = 0;\n" +
            "\n" +
            "        for(j = 0; j<range; j++)\n" +
            "            while(phole[j]-->0)\n" +
            "                arr[index++]=j+min;\n" +
            "\n" +
            "    }";

    public static final String cycle_sort = "// Java program to impleament cycle sort\n" +
            " \n" +
            "import java.util.*;\n" +
            "import java.lang.*;\n" +
            " \n" +
            "class GFG\n" +
            "{\n" +
            "// Function sort the array using Cycle sort\n" +
            "    public static void cycleSort (int arr[], int n)\n" +
            "    {\n" +
            "        // count number of memory writes\n" +
            "        int writes = 0;\n" +
            " \n" +
            "        // traverse array elements and put it to on\n" +
            "        // the right place\n" +
            "        for (int cycle_start=0; cycle_start<=n-2; cycle_start++)\n" +
            "        {\n" +
            "            // initialize item as starting point\n" +
            "            int item = arr[cycle_start];\n" +
            " \n" +
            "            // Find position where we put the item. We basically\n" +
            "            // count all smaller elements on right side of item.\n" +
            "            int pos = cycle_start;\n" +
            "            for (int i = cycle_start+1; i<n; i++)\n" +
            "                if (arr[i] < item)\n" +
            "                    pos++;\n" +
            " \n" +
            "            // If item is already in correct position\n" +
            "            if (pos == cycle_start)\n" +
            "                continue;\n" +
            " \n" +
            "            // ignore all duplicate elements\n" +
            "            while (item == arr[pos])\n" +
            "                pos += 1;\n" +
            " \n" +
            "            // put the item to it's right position\n" +
            "            if (pos != cycle_start)\n" +
            "            {\n" +
            "                int temp = item;\n" +
            "                item = arr[pos];\n" +
            "                arr[pos] = temp;\n" +
            "                writes++;\n" +
            "            }\n" +
            " \n" +
            "            // Rotate rest of the cycle\n" +
            "            while (pos != cycle_start)\n" +
            "            {\n" +
            "                pos = cycle_start;\n" +
            " \n" +
            "                // Find position where we put the element\n" +
            "                for (int i = cycle_start+1; i<n; i++)\n" +
            "                    if (arr[i] < item)\n" +
            "                        pos += 1;\n" +
            " \n" +
            "                // ignore all duplicate elements\n" +
            "                while (item == arr[pos])\n" +
            "                    pos += 1;\n" +
            " \n" +
            "                // put the item to it's right position\n" +
            "                if (item != arr[pos])\n" +
            "                {\n" +
            "                    int temp = item;\n" +
            "                    item = arr[pos];\n" +
            "                    arr[pos] = temp;\n" +
            "                    writes++;\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }";

    public static final String cocktail_sort = "void cocktailSort(int a[])\n" +
            "    {\n" +
            "        boolean swapped = true;\n" +
            "        int start = 0;\n" +
            "        int end = a.length;\n" +
            "\n" +
            "        while (swapped==true)\n" +
            "        {\n" +
            "            // reset the swapped flag on entering the \n" +
            "            // loop, because it might be true from a \n" +
            "            // previous iteration.\n" +
            "            swapped = false;\n" +
            "\n" +
            "            // loop from bottom to top same as\n" +
            "            // the bubble sort\n" +
            "            for (int i = start; i < end-1; ++i)\n" +
            "            {\n" +
            "                if (a[i] > a[i + 1])\n" +
            "                {\n" +
            "                    int temp = a[i];\n" +
            "                    a[i] = a[i+1];\n" +
            "                    a[i+1] = temp;\n" +
            "                    swapped = true;\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            // if nothing moved, then array is sorted.\n" +
            "            if (swapped==false)\n" +
            "                break;\n" +
            "\n" +
            "            // otherwise, reset the swapped flag so that it\n" +
            "            // can be used in the next stage\n" +
            "            swapped = false;\n" +
            "\n" +
            "            // move the end point back by one, because\n" +
            "            // item at the end is in its rightful spot\n" +
            "            end = end-1;\n" +
            "\n" +
            "            // from top to bottom, doing the\n" +
            "            // same comparison as in the previous stage\n" +
            "            for (int i = end-1; i >=start; i--)\n" +
            "            {\n" +
            "                if (a[i] > a[i+1])\n" +
            "                {\n" +
            "                    int temp = a[i];\n" +
            "                    a[i] = a[i+1];\n" +
            "                    a[i+1] = temp;\n" +
            "                    swapped = true;\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            // increase the starting point, because\n" +
            "            // the last stage would have moved the next\n" +
            "            // smallest number to its rightful spot.\n" +
            "            start = start+1;\n" +
            "        }\n" +
            "    }";

    public static final String bitonic_sort = "void compAndSwap(int a[], int i, int j, int dir)\n" +
            "    {\n" +
            "        if ( (a[i] > a[j] && dir == 1) ||\n" +
            "             (a[i] < a[j] && dir == 0))\n" +
            "        {\n" +
            "            // Swapping elements\n" +
            "            int temp = a[i];\n" +
            "            a[i] = a[j];\n" +
            "            a[j] = temp;\n" +
            "        }\n" +
            "    }\n" +
            " \n" +
            "    /* It recursively sorts a bitonic sequence in ascending\n" +
            "       order, if dir = 1, and in descending order otherwise\n" +
            "       (means dir=0). The sequence to be sorted starts at\n" +
            "       index position low, the parameter cnt is the number\n" +
            "       of elements to be sorted.*/\n" +
            "    void bitonicMerge(int a[], int low, int cnt, int dir)\n" +
            "    {\n" +
            "        if (cnt>1)\n" +
            "        {\n" +
            "            int k = cnt/2;\n" +
            "            for (int i=low; i<low+k; i++)\n" +
            "                compAndSwap(a,i, i+k, dir);\n" +
            "            bitonicMerge(a,low, k, dir);\n" +
            "            bitonicMerge(a,low+k, k, dir);\n" +
            "        }\n" +
            "    }\n" +
            " \n" +
            "    /* This funcion first produces a bitonic sequence by\n" +
            "       recursively sorting its two halves in opposite sorting\n" +
            "       orders, and then  calls bitonicMerge to make them in\n" +
            "       the same order */\n" +
            "    void bitonicSort(int a[], int low, int cnt, int dir)\n" +
            "    {\n" +
            "        if (cnt>1)\n" +
            "        {\n" +
            "            int k = cnt/2;\n" +
            " \n" +
            "            // sort in ascending order since dir here is 1\n" +
            "            bitonicSort(a, low, k, 1);\n" +
            " \n" +
            "            // sort in descending order since dir here is 0\n" +
            "            bitonicSort(a,low+k, k, 0);\n" +
            " \n" +
            "            // Will merge wole sequence in ascending order\n" +
            "            // since dir=1.\n" +
            "            bitonicMerge(a, low, cnt, dir);\n" +
            "        }\n" +
            "    }\n" +
            " \n" +
            "    /*Caller of bitonicSort for sorting the entire array\n" +
            "      of length N in ASCENDING order */\n" +
            "    void sort(int a[], int N, int up)\n" +
            "    {\n" +
            "        bitonicSort(a, 0, N, up);\n" +
            "    }";

    public static final String pancake_sort = "static void flip(int arr[], int i)\n" +
            "    {\n" +
            "        int temp, start = 0;\n" +
            "        while (start < i)\n" +
            "        {\n" +
            "            temp = arr[start];\n" +
            "            arr[start] = arr[i];\n" +
            "            arr[i] = temp;\n" +
            "            start++;\n" +
            "            i--;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /* Returns index of the maximum element in arr[0..n-1] */\n" +
            "    static int findMax(int arr[], int n)\n" +
            "    {\n" +
            "        int mi, i;\n" +
            "        for (mi = 0, i = 0; i < n; ++i)\n" +
            "            if (arr[i] > arr[mi])\n" +
            "                mi = i;\n" +
            "        return mi;\n" +
            "    }\n" +
            "\n" +
            "    // The main function that sorts given array using flip\n" +
            "    // operations\n" +
            "    static int pancakeSort(int arr[], int n)\n" +
            "    {\n" +
            "        // Start from the complete array and one by one\n" +
            "        // reduce current size by one\n" +
            "        for (int curr_size = n; curr_size > 1; --curr_size)\n" +
            "        {\n" +
            "            // Find index of the maximum element in\n" +
            "            // arr[0..curr_size-1]\n" +
            "            int mi = findMax(arr, curr_size);\n" +
            "\n" +
            "            // Move the maximum element to end of current\n" +
            "            // array if it's not already at the end\n" +
            "            if (mi != curr_size-1)\n" +
            "            {\n" +
            "                // To move at the end, first move maximum\n" +
            "                // number to beginning\n" +
            "                flip(arr, mi);\n" +
            "\n" +
            "                // Now move the maximum number to end by\n" +
            "                // reversing current array\n" +
            "                flip(arr, curr_size-1);\n" +
            "            }\n" +
            "        }\n" +
            "        return 0;\n" +
            "    }";

    public static final String bogo_sort = "void bogoSort(int[] a)\n" +
            "    {\n" +
            "        // if array is not sorted then shuffle the\n" +
            "        // array again\n" +
            "        while (isSorted(a) == false)\n" +
            "            shuffle(a);\n" +
            "    }\n" +
            "\n" +
            "    // To generate permuatation of the array\n" +
            "    void shuffle(int[] a)\n" +
            "    {\n" +
            "         // Math.random() returns a double positive\n" +
            "         // value, greater than or equal to 0.0 and\n" +
            "         // less than 1.0.\n" +
            "         for (int i=1; i <= n; i++)\n" +
            "             swap(a, i, (int)(Math.random()*i));\n" +
            "    }\n" +
            "\n" +
            "    // Swapping 2 elements\n" +
            "    void swap(int[] a, int i, int j)\n" +
            "    {\n" +
            "        int temp = a[i];\n" +
            "        a[i] = a[j];\n" +
            "        a[j] = temp;\n" +
            "    }\n" +
            "\n" +
            "    // To check if array is sorted or not\n" +
            "    boolean isSorted(int[] a)\n" +
            "    {\n" +
            "        for (int i=1; i<a.length; i++)\n" +
            "            if (a[i] < a[i-1])\n" +
            "                return false;\n" +
            "        return true;\n" +
            "    }";

    public static final String gnome_sort = "static void gnomeSort(int arr[], int n)\n" +
            "    {\n" +
            "        int index = 0;\n" +
            " \n" +
            "        while (index < n)\n" +
            "        {\n" +
            "            if (index == 0)\n" +
            "                index++;\n" +
            "            if (arr[index] >= arr[index-1])\n" +
            "                index++;\n" +
            "            else\n" +
            "            {\n" +
            "                int temp =0;\n" +
            "                temp = arr[index];\n" +
            "                arr[index] = arr[index-1];\n" +
            "                arr[index-1] = temp;\n" +
            "                index--;\n" +
            "            }\n" +
            "        }\n" +
            "        return;\n" +
            "    }";

    public static final String sleep_sort = "// This is the instruction set of a thread\n" +
            "// So in these threads, we \"sleep\" for a particular\n" +
            "// amount of time and then when it wakes up\n" +
            "// the number is printed out\n" +
            "void routine(void *a)\n" +
            "{\n" +
            "    int n = *(int *) a; // typecasting from void to int\n" +
            " \n" +
            "    // Sleeping time is proportional to the number\n" +
            "    // More precisely this thread sleep for 'n' milliseconds\n" +
            "    Sleep(n);\n" +
            " \n" +
            "    // After the sleep, print the number\n" +
            "    printf(\"%d \", n);\n" +
            "}\n" +
            "/* A function that performs sleep sort\n" +
            "_beginthread() is a C run-time library call that creates a new\n" +
            "'thread' for all the integers in the array and returns that\n" +
            "thread.\n" +
            " \n" +
            "Each of the 'thread' sleeps for a time proportional to that\n" +
            "integer and print it after waking.\n" +
            " \n" +
            "We pass three parameters to _beginthread :-\n" +
            "1) start_address --> start address of the routine/function\n" +
            "                     which creates a new thread\n" +
            "2) stack_size --> Stack Size of the new thread (which is 0)\n" +
            "3) arglist --> Address of the argument to be passed\n" +
            " \n" +
            "The return value of _beginthread() function is a handle to the\n" +
            "thread which is created. So we must accept is using the datatype-\n" +
            "'HANDLE' which is included in windows.h header\n" +
            "'HANDLE' datatype is used to represent an event/thread/process etc\n" +
            "So 'HANDLE' datatype is used to define a thread\n" +
            "We store the threads in an array - threads[] which is declared\n" +
            "using 'HANDLE' datatype.\n" +
            " \n" +
            "WaitForMultipleObjects() is a function that processes the threads\n" +
            "and has four arguments-\n" +
            "1) no_of_threads --> Number of threads to be processed\n" +
            "2) array_of_threads --> This is the array of threads which should be\n" +
            "                        processed. This array must be of the type\n" +
            "                        'HANDLE'\n" +
            "3) TRUE or FALSE --> We pass TRUE if we want all the threads in the\n" +
            "                     array to be processed\n" +
            "4) time_limit --> The threads will be processed until this time limit\n" +
            "                  is crossed. So if we pass a 0 then no threads will\n" +
            "                  be processed, otherwise if we pass an INFINITE, then\n" +
            "                  the program will stop only when all the threads\n" +
            "                  are processed. We can put a cap on the execution\n" +
            "                  time of the program by passing the desired time\n" +
            "                  limit */\n" +
            "void sleepSort(int arr[], int n)\n" +
            "{\n" +
            "    // An array of threads, one for each of the elements\n" +
            "    // in the input array\n" +
            "    HANDLE threads[n];\n" +
            " \n" +
            "    // Create the threads for each of the input array elements\n" +
            "    for (int i = 0; i < n; i++)\n" +
            "        threads[i] = (HANDLE)_beginthread(&routine, 0,  &arr[i]);\n" +
            " \n" +
            "    // Process these threads\n" +
            "    WaitForMultipleObjects(n, threads, TRUE, INFINITE);\n" +
            "    return;\n" +
            "}";

    public static final String stooge_sort = "static void stoogesort(int arr[], int l, int h)\n" +
            "    {\n" +
            "        if (l >= h)\n" +
            "           return;\n" +
            " \n" +
            "        // If first element is smaller\n" +
            "        // than last,swap them\n" +
            "        if (arr[l] > arr[h])\n" +
            "        {\n" +
            "            int t = arr[l];\n" +
            "            arr[l] = arr[h];\n" +
            "            arr[h] = t;\n" +
            "        }\n" +
            " \n" +
            "        // If there are more than 2 elements in\n" +
            "        // the array\n" +
            "        if (h-l+1 > 2)\n" +
            "        {\n" +
            "            int t = (h-l+1) / 3;\n" +
            " \n" +
            "            // Recursively sort first 2/3 elements\n" +
            "            stoogesort(arr, l, h-t);\n" +
            " \n" +
            "            // Recursively sort last 2/3 elements\n" +
            "            stoogesort(arr, l+t, h);\n" +
            " \n" +
            "            // Recursively sort first 2/3 elements\n" +
            "            // again to confirm\n" +
            "            stoogesort(arr, l, h-t);\n" +
            "        }\n" +
            "    }";

    public static final String tree_sort = "struct Node\n" +
            "{\n" +
            "    int key;\n" +
            "    struct Node *left, *right;\n" +
            "};\n" +
            " \n" +
            "// A utility function to create a new BST Node\n" +
            "struct Node *newNode(int item)\n" +
            "{\n" +
            "    struct Node *temp = new Node;\n" +
            "    temp->key = item;\n" +
            "    temp->left = temp->right = NULL;\n" +
            "    return temp;\n" +
            "}\n" +
            " \n" +
            "// Stores inoder traversal of the BST\n" +
            "// in arr[]\n" +
            "void storeSorted(Node *root, int arr[], int &i)\n" +
            "{\n" +
            "    if (root != NULL)\n" +
            "    {\n" +
            "        storeSorted(root->left, arr, i);\n" +
            "        arr[i++] = root->key;\n" +
            "        storeSorted(root->right, arr, i);\n" +
            "    }\n" +
            "}\n" +
            " \n" +
            "/* A utility function to insert a new\n" +
            "   Node with given key in BST */\n" +
            "Node* insert(Node* node, int key)\n" +
            "{\n" +
            "    /* If the tree is empty, return a new Node */\n" +
            "    if (node == NULL) return newNode(key);\n" +
            " \n" +
            "    /* Otherwise, recur down the tree */\n" +
            "    if (key < node->key)\n" +
            "        node->left  = insert(node->left, key);\n" +
            "    else if (key > node->key)\n" +
            "        node->right = insert(node->right, key);\n" +
            " \n" +
            "    /* return the (unchanged) Node pointer */\n" +
            "    return node;\n" +
            "}\n" +
            " \n" +
            "// This function sorts arr[0..n-1] using Tree Sort\n" +
            "void treeSort(int arr[], int n)\n" +
            "{\n" +
            "    struct Node *root = NULL;\n" +
            " \n" +
            "    // Construct the BST\n" +
            "    root = insert(root, arr[0]);\n" +
            "    for (int i=1; i<n; i++)\n" +
            "        insert(root, arr[i]);\n" +
            " \n" +
            "    // Store inoder traversal of the BST\n" +
            "    // in arr[]\n" +
            "    int i = 0;\n" +
            "    storeSorted(root, arr, i);\n" +
            "}";

    public static final String brick_sort = "public static void brickSort(int arr[], int n)\n" +
            "    {\n" +
            "        boolean isSorted = false; // Initially array is unsorted\n" +
            "\n" +
            "        while (!isSorted)\n" +
            "        {\n" +
            "            isSorted = true;\n" +
            "            int temp =0;\n" +
            "\n" +
            "            // Perform Bubble sort on odd indexed element\n" +
            "            for (int i=1; i<=n-2; i=i+2)\n" +
            "            {\n" +
            "                if (arr[i] > arr[i+1])\n" +
            "                {\n" +
            "                    temp = arr[i];\n" +
            "                    arr[i] = arr[i+1];\n" +
            "                    arr[i+1] = temp;\n" +
            "                    isSorted = false;\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            // Perform Bubble sort on even indexed element\n" +
            "            for (int i=0; i<=n-2; i=i+2)\n" +
            "            {\n" +
            "                if (arr[i] > arr[i+1])\n" +
            "                {\n" +
            "                    temp = arr[i];\n" +
            "                    arr[i] = arr[i+1];\n" +
            "                    arr[i+1] = temp;\n" +
            "                    isSorted = false;\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        return;\n" +
            "    }";

    // Searching Algorithms

    public static final String linear_search = "static int search(int arr[], int n, int x)\n" +
            "    {\n" +
            "        for (int i = 0; i < n; i++)\n" +
            "        {\n" +
            "            // Return the index of the element if the element\n" +
            "            // is found\n" +
            "            if (arr[i] == x)\n" +
            "                return i;\n" +
            "        }\n" +
            "  \n" +
            "        // return -1 if the element is not found\n" +
            "        return -1;\n" +
            "    }";

    public static final String binary_search = "int binarySearch(int arr[], int l, int r, int x)\n" +
            "    {\n" +
            "        if (r>=l)\n" +
            "        {\n" +
            "            int mid = l + (r - l)/2;\n" +
            " \n" +
            "            // If the element is present at the middle itself\n" +
            "            if (arr[mid] == x)\n" +
            "               return mid;\n" +
            " \n" +
            "            // If element is smaller than mid, then it can only\n" +
            "            // be present in left subarray\n" +
            "            if (arr[mid] > x)\n" +
            "               return binarySearch(arr, l, mid-1, x);\n" +
            " \n" +
            "            // Else the element can only be present in right\n" +
            "            // subarray\n" +
            "            return binarySearch(arr, mid+1, r, x);\n" +
            "        }\n" +
            " \n" +
            "        // We reach here when element is not present in array\n" +
            "        return -1;\n" +
            "    }";

    public static final String jump_search = "public static int jumpSearch(int[] arr, int x)\n" +
            "    {\n" +
            "        int n = arr.length;\n" +
            " \n" +
            "        // Finding block size to be jumped\n" +
            "        int step = (int)Math.floor(Math.sqrt(n));\n" +
            " \n" +
            "        // Finding the block where element is\n" +
            "        // present (if it is present)\n" +
            "        int prev = 0;\n" +
            "        while (arr[Math.min(step, n)-1] < x)\n" +
            "        {\n" +
            "            prev = step;\n" +
            "            step += (int)Math.floor(Math.sqrt(n));\n" +
            "            if (prev >= n)\n" +
            "                return -1;\n" +
            "        }\n" +
            " \n" +
            "        // Doing a linear search for x in block\n" +
            "        // beginning with prev.\n" +
            "        while (arr[prev] < x)\n" +
            "        {\n" +
            "            prev++;\n" +
            " \n" +
            "            // If we reached next block or end of\n" +
            "            // array, element is not present.\n" +
            "            if (prev == Math.min(step, n))\n" +
            "                return -1;\n" +
            "        }\n" +
            " \n" +
            "        // If element is found\n" +
            "        if (arr[prev] == x)\n" +
            "            return prev;\n" +
            " \n" +
            "        return -1;\n" +
            "    }";

    public static final String interpolation_search = "static int interpolationSearch(int x)\n" +
            "    {\n" +
            "        // Find indexes of two corners\n" +
            "        int lo = 0, hi = (arr.length - 1);\n" +
            "      \n" +
            "        // Since array is sorted, an element present\n" +
            "        // in array must be in range defined by corner\n" +
            "        while (lo <= hi && x >= arr[lo] && x <= arr[hi])\n" +
            "        {\n" +
            "            // Probing the position with keeping\n" +
            "            // uniform distribution in mind.\n" +
            "            int pos = lo + (((hi-lo) /\n" +
            "                  (arr[hi]-arr[lo]))*(x - arr[lo]));\n" +
            "      \n" +
            "            // Condition of target found\n" +
            "            if (arr[pos] == x)\n" +
            "                return pos;\n" +
            "      \n" +
            "            // If x is larger, x is in upper part\n" +
            "            if (arr[pos] < x)\n" +
            "                lo = pos + 1;\n" +
            "      \n" +
            "            // If x is smaller, x is in lower part\n" +
            "            else\n" +
            "                hi = pos - 1;\n" +
            "        }\n" +
            "        return -1;\n" +
            "    }";

    public static final String exponential_search = "static int exponentialSearch(int arr[], int n, int x)\n" +
            "    {\n" +
            "        // If x is present at firt location itself\n" +
            "        if (arr[0] == x)\n" +
            "            return 0;\n" +
            "      \n" +
            "        // Find range for binary search by\n" +
            "        // repeated doubling\n" +
            "        int i = 1;\n" +
            "        while (i < n && arr[i] <= x)\n" +
            "            i = i*2;\n" +
            "      \n" +
            "        //  Call binary search for the found range.\n" +
            "        return Arrays.binarySearch(arr, i/2, Math.min(i, n), x);\n" +
            "    }";

    public static final String fibonacci_search = "int fibMonaccianSearch(int arr[], int x, int n)\n" +
            "{\n" +
            "    /* Initialize fibonacci numbers */\n" +
            "    int fibMMm2 = 0;   // (m-2)'th Fibonacci No.\n" +
            "    int fibMMm1 = 1;   // (m-1)'th Fibonacci No.\n" +
            "    int fibM = fibMMm2 + fibMMm1;  // m'th Fibonacci\n" +
            " \n" +
            "    /* fibM is going to store the smallest Fibonacci\n" +
            "       Number greater than or equal to n */\n" +
            "    while (fibM < n)\n" +
            "    {\n" +
            "        fibMMm2 = fibMMm1;\n" +
            "        fibMMm1 = fibM;\n" +
            "        fibM  = fibMMm2 + fibMMm1;\n" +
            "    }\n" +
            " \n" +
            "    // Marks the eliminated range from front\n" +
            "    int offset = -1;\n" +
            " \n" +
            "    /* while there are elements to be inspected. Note that\n" +
            "       we compare arr[fibMm2] with x. When fibM becomes 1,\n" +
            "       fibMm2 becomes 0 */\n" +
            "    while (fibM > 1)\n" +
            "    {\n" +
            "        // Check if fibMm2 is a valid location\n" +
            "        int i = min(offset+fibMMm2, n-1);\n" +
            " \n" +
            "        /* If x is greater than the value at index fibMm2,\n" +
            "           cut the subarray array from offset to i */\n" +
            "        if (arr[i] < x)\n" +
            "        {\n" +
            "            fibM  = fibMMm1;\n" +
            "            fibMMm1 = fibMMm2;\n" +
            "            fibMMm2 = fibM - fibMMm1;\n" +
            "            offset = i;\n" +
            "        }\n" +
            " \n" +
            "        /* If x is greater than the value at index fibMm2,\n" +
            "           cut the subarray after i+1  */\n" +
            "        else if (arr[i] > x)\n" +
            "        {\n" +
            "            fibM  = fibMMm2;\n" +
            "            fibMMm1 = fibMMm1 - fibMMm2;\n" +
            "            fibMMm2 = fibM - fibMMm1;\n" +
            "        }\n" +
            " \n" +
            "        /* element found. return index */\n" +
            "        else return i;\n" +
            "    }\n" +
            " \n" +
            "    /* comparing the last element with x */\n" +
            "    if(fibMMm1 && arr[offset+1]==x)return offset+1;\n" +
            " \n" +
            "    /*element not found. return -1 */\n" +
            "    return -1;\n" +
            "}";

}
