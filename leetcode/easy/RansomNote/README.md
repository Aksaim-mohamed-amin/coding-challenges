
# Ransom Note

## Problem Statement
Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed by using the letters from `magazine` and `false` otherwise.

Each letter in `magazine` can only be used **once** in `ransomNote`.

### Example 1:
**Input:**
```
ransomNote = "a", magazine = "b"
```
**Output:**
```
false
```

### Example 2:
**Input:**
```
ransomNote = "aa", magazine = "ab"
```
**Output:**
```
false
```

### Example 3:
**Input:**
```
ransomNote = "aa", magazine = "aab"
```
**Output:**
```
true
```

## Constraints:
- `1 <= ransomNote.length, magazine.length <= 10⁵`
- `ransomNote` and `magazine` consist of lowercase English letters.

---

## Solution

### Approach:
1. **Use a HashMap** to count occurrences of each character in the `magazine`.
2. **Iterate through** each character in `ransomNote`. If a character is not available or exhausted in the `magazine`, return `false`.
3. **Decrement** the count for each character used from `magazine`.