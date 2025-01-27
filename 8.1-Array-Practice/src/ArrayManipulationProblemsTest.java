import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ArrayManipulationProblemsTest {

    // Test cases for findMissingNumber
    @Test
    public void testFindMissingNumber() {
        int[] array1 = {1, 2, 4, 5, 6};
        int n1 = 6;
        assertEquals(3, ArrayManipulationProblems.findMissingNumber(array1, n1));

        int[] array2 = {1, 2, 3, 5};
        int n2 = 5;
        assertEquals(4, ArrayManipulationProblems.findMissingNumber(array2, n2));
    }

    // Test cases for mergeArrays
    @Test
    public void testMergeArrays() {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, ArrayManipulationProblems.mergeArrays(array1, array2));
    }

    @Test
    public void testMergeArraysWithEmptyArray() {
        int[] array1 = {};
        int[] array2 = {2, 4, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, ArrayManipulationProblems.mergeArrays(array1, array2));
    }

    // Test cases for findLargestElement
    @Test
    public void testFindLargestElement() {
        int[] array = {3, 3, 4, 2, 3, 3, 3};
        assertEquals(4, ArrayManipulationProblems.findLargestElement(array));
    }

    @Test
    public void testFindLargestElementWithNegativeNumbers() {
        int[] array = {-1, -3, -4, -2, -5};
        assertEquals(-1, ArrayManipulationProblems.findLargestElement(array));
    }

    // Test cases for moveZeroes
    @Test
    public void testMoveZeroes() {
        int[] array = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        ArrayManipulationProblems.moveZeroes(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMoveZeroesWithNoZeroes() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        ArrayManipulationProblems.moveZeroes(array);
        assertArrayEquals(expected, array);
    }

    // Test cases for findMaxSumSubarray
    @Test
    public void testFindMaxSumSubarray() {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 3;
        assertEquals(9, ArrayManipulationProblems.findMaxSumSubarray(array, k));
    }

    @Test
    public void testFindMaxSumSubarrayWithNegativeNumbers() {
        int[] array = {-2, -1, -3, -4, -1, -2};
        int k = 2;
        assertEquals(-3, ArrayManipulationProblems.findMaxSumSubarray(array, k));
    }

   @Test
    public void testFindMaxSumSubarrayWithInvalidK() {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 7; // k is greater than the array length
        assertEquals(-1, ArrayManipulationProblems.findMaxSumSubarray(array, k));
    }
}
