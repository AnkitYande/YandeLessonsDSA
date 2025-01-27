# First Unique Character in a String  

Given a string ```s```, find its first non-repeating character and return its index. If it does not exist, return ```-1```.

 ```
Example 1:
Input: s = "leetcode"
Output: 0
```

```
Example 2:
Input: s = "loveleetcode"
Output: 2
```
```
Example 3:
Input: s = "aabb"
Output: -1
 ```

Constraints:
```
s consists of only lowercase English letters.
```

## Assignment

Given the description above, solve the problem in two ways:

- **The "naive" O(n^2) Solution**: Using nested for-loops, go through each character and see if that character exists elsewhere in the string.
- **The "optimized" O(n) Solution** Use a hashmap to store counts of each letter. Then, go back through the string to find the first occurrence without duplicates
  
**Extra Credit:** Come up with a different solution / impovement over one of the first two solutions that is more efficent in terms of _speed_ or _memory_. Please explain your solution and optimization in plain English in a comment block above your function.

---

Note: Timing in Replit is inaccurate because it is running on a server. Running the program locally and averaging over multiple trials will give you more consistent results. Additionally, the Java compiler optimizes solutions. If you want the raw efficiency results of your code type ```java -Djava.compiler=NONE Main``` into your console instead of hitting the 'Run' button