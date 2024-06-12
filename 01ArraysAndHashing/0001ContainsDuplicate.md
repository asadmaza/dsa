# 217. Contains Duplicate
## Arrays and Hashing
#### Easy

## Problem Description
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

## Examples

#### Example 1:
**Input:**`nums = [1,2,3,1]`
**Output:** `true`

#### Example 2:
**Input:**`nums = [1,2,3,4]`
**Output:** `false`

#### Example 3:
**Input:**`nums = [1,1,1,3,3,4,3,2,4,2]`
**Output:** `true`

### Constraints
- `1 <= nums.length <= 105`
- `-10^9 <= nums[i] <= 109`


## Solutions

### Best Solution
**Strategy:** For each value in array, we check whether this value exists in HashSet, if it exists we return true, otherwise we add it to HashSet and iterate until we reach end of array. If we reach end of array we return false as all values in array are distinct, otherwise we would have returned true at some point in the array.

**Data Structure: HashSet** 
*Definition:* Form of a Hash Table data structure that usually holds large number of elements. Using HashSet we can quickly search, add, and remove elements. Used to lookup if an element is a part of the set.
*Application to Problem:* It allows us to insert elements that do not exist in HashSet and we can also check whether a value exists in a HashSet

**Efficiency:** Tradeoff - sacrifice space complexity to achieve better time complexity.

#### Time Complexity
$\ O(n)$ - We are only looping through array once as we check and add to HashSet

#### Space Complexity
$\ O(n)$ - Maximum memory used here is the size of the array


### First Attempt
**Strategy:** Sort array first, then if any duplicates exist in array they will be adjacent. Hence only iterate through array once and we check two neighbours with two pointers until we have checked entire array.

**Efficiency:** Better time complexity than brute force method.

#### Time Complexity
$\ O(n\log n)$ - sorting is what takes time here, we only loop through array once so it has no effect.

#### Space Complexity
$\ O(1)$ - memory used is constant here if you're not space used by sorting algorithm and two pointers is fixed memory.


### Brute Force
**Strategy:** For each value in the array, you compare with every other value in the array. So you have to iterate through list for each value.

**Efficiency:** Better solution exists as the problem is time complexity squared, conversely, space complexity is constant as you're not using any extra space.

#### Time Complexity
$\ O(n^2)$ - you loop through the array for each value

#### Space Complexity
$\ O(1)$ - memory used is constant here