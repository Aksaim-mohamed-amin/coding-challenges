# Length of Last Word

## Problem Overview
Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

### Example 1:
**Input:** `s = "Hello World"`  
**Output:** `5`  
**Explanation:**  
The last word is `"World"` with length `5`.

### Example 2:
**Input:** `s = "   fly me   to   the moon  "`  
**Output:** `4`  
**Explanation:**  
The last word is `"moon"` with length `4`.

### Example 3:
**Input:** `s = "luffy is still joyboy"`  
**Output:** `6`  
**Explanation:**  
The last word is `"joyboy"` with length `6`.

---

## Solution
To find the length of the last word in a string, we can follow these steps:

1. **Trim the string** to remove leading and trailing spaces.
2. **Find the last space** in the string.
3. **Calculate the length** of the last word by subtracting the position of the last space from the total length.