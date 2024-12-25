# Maximum Subarray Finder

The Maximum Subarray Finder project identifies the contiguous subarray within a given array of integers that has the largest sum.

## Features

- **Dynamic Input Handling**: 
  - Accepts integers from the user until the keyword `break` is entered.
  - Handles invalid inputs gracefully with informative messages.
- **Kadane's Algorithm**: Efficiently computes the maximum subarray sum and its indices.
- **Output**: Displays the maximum subarray and its corresponding sum.

## Technologies

- **Language**: Java
- **Algorithm**: Kadane's Algorithm for finding maximum subarrays.

## Kadane's Algorithm Explained

Kadane's Algorithm works by iterating through the array while maintaining two variables:
1. **Current Sum (`currentSum`)**: The maximum sum of the subarray ending at the current position.
2. **Global Maximum (`maxSum`)**: The maximum sum encountered so far.

### Visual Example:
Given an array: `[−2, 1, −3, 4, −1, 2, 1, −5, 4]`

1. Start with `currentSum = 0` and `maxSum = -∞`.
2. Traverse the array:
   - For each element, calculate `currentSum = max(element, currentSum + element)`.
   - Update `maxSum = max(maxSum, currentSum)` if `currentSum` exceeds it.

Intermediate steps:
- Step 1: `currentSum = -2`, `maxSum = -2`
- Step 2: `currentSum = 1`, `maxSum = 1`
- Step 3: `currentSum = -2`, `maxSum = 1`
- Step 4: `currentSum = 4`, `maxSum = 4`
- Step 5: `currentSum = 3`, `maxSum = 4`
- ...
- Final: Maximum subarray `[4, −1, 2, 1]` with sum `6`.

## Why O(n) Complexity?

Kadane's Algorithm has a time complexity of **O(n)** because:
1. It iterates through the array only once.
2. For each element, only constant-time operations are performed:
   - Comparing values for `currentSum` and `maxSum`.
   - Updating variables.

Thus, the algorithm efficiently finds the solution in linear time, making it ideal for large arrays.

## License

This project is licensed under the MIT License.
