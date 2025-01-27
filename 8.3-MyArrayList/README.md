
# Implementing MyArrayList using Arrays

## Objective

The objective of this assignment is to implement a dynamic array list class called `MyArrayList` that mimics the behavior of Java's `ArrayList`. The `MyArrayList` class should be implemented using arrays and should dynamically resize as elements are added. The implementation should use **generics** to allow the list to hold any type of objects.

Java ArrayList documentation: [https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html")

## Requirements

1. **Use of Generics:** Just like the real ArrayList your class should be able to take in any data type.
2. **Dynamic Resizing:** The list should grow in size by doubling its capacity when the array is full. The list does not need to dynamically shrink.
3. **Basic Methods:**

   * Constructor: Your data should be stored in a global array. Initialize the array with an initial capacity (e.g., 10). The constructor should not take anything in.
   * `add(element)`: Adds an element to the end of the list. If the new element does not fit in the array, dynamically grow the array.
   * `get(index)`: Returns the element at the specified index.
   * `set(index, element)`: Replaces the element at the specified index with the new element.
   * `remove(index)`: Removes the element at the specified index and shifts subsequent elements to the left.
   * `size()`: Returns the number of elements in the list.
   * `toString()`: Returns a string representation of the list.
4. **Error Handling**: Make sure to throw `IndexOutOfBoundsException` if the user tries to access an index that does not exist.
