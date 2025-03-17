# Valid Anagram

## Problem Statement
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

### Example 1:
**Input:**
s = "anagram"
t = "nagaram"

**Output:**
true

### Example 2:
**Input:**
s = "rat"
t = "car"

**Output:**
false

---

## Approach

### HashMap Method
1. Check Lengths:
    - If `s` and `t` have different lengths, they cannot be anagrams. Return `false`.

2. Build Frequency Count:
    - Use a HashMap to store the frequency of characters in `s`.
    - Iterate through `t`, decreasing the frequency count for each character.
    - If any character count goes below zero, return `false`.

3. Final Check:
    - If all character counts in the HashMap are zero, return `true`.