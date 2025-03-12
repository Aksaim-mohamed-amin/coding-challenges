# Word Pattern

## Problem Statement
Given a pattern and a string `s`, find if `s` follows the same pattern.

### Follow means:
- Each letter in `pattern` maps to exactly one unique word in `s`.
- Each unique word in `s` maps to exactly one letter in `pattern`.
- No two letters map to the same word, and no two words map to the same letter.

### Example 1:
**Input:**
```
pattern = "abba", s = "dog cat cat dog"
```
**Output:**
```
true
```
**Explanation:**
```
'a' -> "dog"
'b' -> "cat"
'b' -> "cat"
'a' -> "dog"
```
The mapping is consistent, so the result is **true**.

### Example 2:
**Input:**
```
pattern = "abba", s = "dog cat cat fish"
```
**Output:**
```
false
```
**Explanation:**
```
'a' -> "dog"
'b' -> "cat"
'b' -> "cat"
'a' -> "fish" (Mismatch! 'a' was already mapped to "dog")
```

---

## Solution

1. **Split the string `s` into words**  
   Example:
   ```
   "dog cat cat dog" → ["dog", "cat", "cat", "dog"]
   ```

2. **Check if pattern length matches words length**  
   If `pattern.length() != words.length`, return `false`.

3. **Use two HashMaps for mapping both ways:**
    - `characterToWord`: Maps pattern character → word.
    - `wordToCharacter`: Maps word → pattern character.

4. **Iterate through pattern and words**
    - If a character is already mapped to a word, check if it's the same word.
    - If a word is already mapped to a character, check if it's the same character.
    - If any inconsistency is found, return `false`.

5. **Return `true` if no mismatches occur.**
