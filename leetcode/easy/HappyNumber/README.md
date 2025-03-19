# Happy Number

## Problem Description

A **happy number** is a number defined by the following process:

1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals `1` (where it will stay), or it loops endlessly in a cycle which does not include `1`.

Those numbers for which this process ends in `1` are **happy**.

### Task

Return `true` if `n` is a happy number, and `false` if not.

## Example 1

**Input:**
n = 19

**Output:**
true

**Explanation:**
1^2 + 9^2 = 82  
8^2 + 2^2 = 68  
6^2 + 8^2 = 100  
1^2 + 0^2 + 0^2 = 1

## Example 2

**Input:**
n = 2

**Output:**
false

**Explanation:**
2^2 = 4  
4^2 = 16  
1^2 + 6^2 = 37  
3^2 + 7^2 = 58  
5^2 + 8^2 = 89  
8^2 + 9^2 = 145  
1^2 + 4^2 + 5^2 = 42  
4^2 + 2^2 = 20  
2^2 + 0^2 = 4  
Cycle detected: 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4...

## Approach

We can detect whether a number is happy by repeatedly replacing it with the sum of the squares of its digits. If the process ends in `1`, the number is happy. If a cycle is detected (i.e., a number is repeated), then the number is not happy.