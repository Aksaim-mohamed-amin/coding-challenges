# Linked List Cycle Detection

## Problem Description

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that the tail's `next` pointer is connected to. Note that `pos` is not passed as a parameter.

### Task

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

## Example 1

**Input:**
head = [3,2,0,-4], pos = 1

**Output:**
true

**Explanation:**
There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

## Example 2

**Input:**
head = [1,2], pos = 0

**Output:**
true

**Explanation:**
There is a cycle in the linked list, where the tail connects to the 0th node.

## Example 3

**Input:**
head = [1], pos = -1

**Output:**
false

**Explanation:**
There is no cycle in the linked list.

## Approach

We can detect if a linked list has a cycle using the **Floyd’s Cycle-Finding Algorithm** (also known as the **Tortoise and Hare** algorithm). The idea is to have two pointers:
1. A **slow pointer** that moves one step at a time.
2. A **fast pointer** that moves two steps at a time.

If there is a cycle, the fast pointer will eventually catch up with the slow pointer. If the fast pointer reaches the end of the list (null), then there is no cycle.