package org.example.algorithms.sortings;

public class BriefIntroOfSortings {
   /** There are many types of sorting algorithms,
    each with different characteristics, advantages, and use cases.
    Here are some of the most common sorting algorithms you should know:
    Simple Sorting Algorithms

    Bubble Sort:
    Description: Repeatedly steps through the list, compares adjacent elements,
                 and swaps them if they are in the wrong order.
    Complexity:𝑂(𝑛2)
    Stability: Stable
    In-Place: Yes

    Selection Sort:
    Description: Divides the input list into two parts: a sorted and an unsorted part,
                 and repeatedly selects the smallest (or largest) element from the unsorted
                 part and moves it to the sorted part.
    Complexity:𝑂(𝑛2)
    Stability: Unstable
    In-Place: Yes

    Insertion Sort:
    Description: Builds the final sorted array one item at a time, with the movement
                 of elements that are greater than the current element.
    Complexity:𝑂(𝑛2)
    Stability: Stable
    In-Place: Yes


    Efficient Sorting Algorithms

    Merge Sort:
    Description: Divides the array into halves, recursively sorts them, and then merges the
                 sorted halves.
    Complexity:𝑂(𝑛log𝑛)
    Stability: Stable
    In-Place: No

    Quick Sort:
    Description: Selects a 'pivot' element, partitions the array into elements less than
                 and greater than the pivot, and recursively sorts the partitions.
    Complexity: Average𝑂(𝑛log𝑛)
    Stability: Unstable
    In-Place: Yes

    Heap Sort:
    Description: Converts the array into a binary heap structure, then repeatedly
                 extracts the maximum element from the heap and rebuilds the heap.
    Complexity:𝑂(𝑛log𝑛)
    Stability: Unstable
    In-Place: Yes

    Specialized Sorting Algorithms

    Counting Sort:
    Description: Counts the number of occurrences of each distinct element and uses
                 this information to place elements into the sorted array.
    Complexity:𝑂(𝑛+𝑘) where k is the range of the input
    Stability: Stable
    In-Place: No

    Radix Sort:
    Description: Processes each digit of the numbers, starting from the least significant
                 digit to the most significant digit,using a stable sub-sorting
                 algorithm like counting sort.
    Complexity:𝑂(𝑛⋅𝑘) where k is the number of digits
    Stability: Stable
    In-Place: No

    Bucket Sort:
    Description: Divides the array into a number of buckets, sorts each bucket individually (often using another sorting algorithm), and then concatenates the sorted buckets.
    Complexity:𝑂(𝑛+𝑘) where 𝑘 is the number of buckets
    Stability: Depends on the sub-sorting algorithm
    In-Place: No

    Advanced Sorting Algorithms
    Tim Sort:
    Description: Hybrid sorting algorithm derived from merge sort and insertion sort, optimized for real-world data.
    Complexity:𝑂(𝑛log𝑛)
    Stability: Stable
    In-Place: No (but uses less auxiliary space than merge sort)

    Shell Sort:
    Description: Generalization of insertion sort that allows the exchange of far apart elements to improve efficiency.
                 Complexity: Depends on gap sequence, typically between 𝑂(𝑛log𝑛) and 𝑂(𝑛3/2)
    Stability: Unstable
    In-Place: Yes
    Parallel and Distributed Sorting Algorithms

    Bitonic Sort (Parallel):
    Description: Sorting network that recursively sorts two halves of the array into increasing and decreasing sequences and then merges them.
    Complexity:𝑂(log2𝑛)
    Stability: Unstable
    In-Place: Yes

    Odd-Even Transposition Sort (Parallel):
    Description: Simple parallel version of bubble sort where adjacent elements are compared and swapped in parallel steps.
    Complexity:𝑂(𝑛) (Parallel complexity)
    Stability: Stable
    In-Place: Yes Comparison


    Bubble Sort, Selection Sort, Insertion Sort are simple but inefficient for large datasets.

    Merge Sort, Quick Sort, Heap Sort are more efficient and widely used for general purposes.

    Counting Sort, Radix Sort, Bucket Sort are useful for special cases where the range of input data is known and limited.

    Tim Sort is used in real-world libraries (e.g., Python's sort, Java's Arrays.sort) because of its efficiency and stability.

    Parallel sorting algorithms are used for sorting data in parallel computing environments.

    Knowing these sorting algorithms helps in understanding their use cases, strengths, and weaknesses, which is crucial for choosing the right algorithm for a given problem.*/
}
