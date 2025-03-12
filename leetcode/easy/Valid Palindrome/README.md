# Valid Palindrome

## Problem Overview
A phrase is a palindrome if, after converting all uppercase letters into lowercase and removing all non-alphanumeric characters, it reads the same forward and backward.

### **Example 1**
**Input:** `"A man, a plan, a canal: Panama"`  
**Output:** `true`  
**Explanation:** After cleaning, `"amanaplanacanalpanama"` is a palindrome.

### **Example 2**
**Input:** `"race a car"`  
**Output:** `false`  
**Explanation:** `"raceacar"` is not a palindrome.

### **Example 3**
**Input:** `" "`  
**Output:** `true`  
**Explanation:** An empty string after cleaning is considered a palindrome.

---

## Solution Approach
### **Optimized Two-Pointer Method**
We use two pointers:
1. One starting from the beginning (`start`).
2. One from the end (`end`).
3. Both move towards the center, skipping non-alphanumeric characters.
4. Compare lowercase versions of valid characters, if a mismatch found return false.
5. finally return true if no mismatch was found.