# Group Anagrams

## Problem Statement
Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

### Example 1:
```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

### Example 2:
```
Input: strs = [""]
Output: [[""]]
```

### Example 3:
```
Input: strs = ["a"]
Output: [["a"]]
```

## Approach

### Sorting + HashMap Approach
1. **Sort each word** to create a unique key for anagrams.
2. **Use a HashMap** where:
    - **Key**: Sorted version of the word.
    - **Value**: List of words that match this sorted version.
3. **Return the grouped values** from the HashMap.

## Explanation
1. Convert each string into a **character array and sort it**.
2. Use a **HashMap**:
    - The **key** is the sorted string.
    - The **value** is a list of words that match this sorted string.
3. **Return** the values of the HashMap as a list of lists.