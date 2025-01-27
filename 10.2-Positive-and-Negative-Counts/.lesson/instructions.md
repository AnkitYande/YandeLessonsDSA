# Instructions  

In this lesson we will learn about the binary search and why it is so much faster than previous searching methods. We will use a timer to measure how much faster the computer can slove this problem.

## Assignment:
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

Tip: when coming up with your solution consider what you should do if there are no 0s or many 0s

Example 1:
```
Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
```

Example 2:
```
Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
```

Example 3:
```
Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
 ```

Constraints:
```
-2000 <= nums[i] <= 2000
nums is sorted in a non-decreasing order.
```

## Requirements
* Your implimentation **must use a modified binary search** argorithm.
* Run the **unit tests** to check your implimentation!

---

Note: Timing in Replit is inaccurate because it is running on a server. Running the program locally and averaging over multiple trials will give you more consistent results. Additionally, the Java compiler optimizes solutions. If you want the raw efficiency results of your code type ```java -Djava.compiler=NONE Main``` into your console instead of hitting the 'Run' button. Also remove any print statements before timing as I/O is very slow (because humans are slow and wont notice).