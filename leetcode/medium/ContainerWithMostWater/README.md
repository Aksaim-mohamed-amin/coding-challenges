# Container With Most Water

## Problem Overview
Given an array `height`, where each element represents the height of a vertical line, find two lines that, together with the x-axis, form a container holding the most water.

### **Example 1**
**Input:** `height = [1,8,6,2,5,4,8,3,7]`  
**Output:** `49`  
**Explanation:** The maximum area is formed between indices `1` and `8`, storing `49` units of water.

### **Example 2**
**Input:** `height = [1,1]`  
**Output:** `1`

---

## Solution Approach
### **Two-Pointer Method**
1. Use two pointers: one at the **leftmost** and one at the **rightmost** position.
2. Compute the area formed by the two pointers.
3. Move the pointer pointing to the **shorter height** inwards, since moving the taller pointer won’t increase the area.
4. Repeat until the pointers meet.