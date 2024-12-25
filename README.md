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

In this implementation, Kadane's Algorithm identifies the subarray with the largest sum by maintaining:
1. **Local Maximum** (`localMaximum`): The maximum sum of the subarray ending at the current position.
2. **Global Maximum** (`globalMaximum`): The largest subarray sum encountered so far.
3. **Start and End Indices**: Indicate the subarray boundaries.

### Procedure:
- Start by initializing `localMaximum` to the first element and `globalMaximum` to a very small value.
- Traverse the array while updating:
  - `localMaximum` to the maximum of either extending the current subarray or starting fresh at the current element.
  - `globalMaximum` if the new `localMaximum` exceeds it.
  - Subarray boundaries whenever `globalMaximum` is updated.

### Visual Example:
Given array: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`

1. Initialize: `localMaximum = -2`, `globalMaximum = -2`, `start = 0`, `end = 0`.
2. Traverse:
   - At `1`: `localMaximum = 1`, update `globalMaximum = 1`, update indices to `start = 1`, `end = 1`.
   - At `4`: `localMaximum = 4`, update `globalMaximum = 6`, update indices to `start = 3`, `end = 6`.
   - Continue updating as necessary.
3. Final output:
   - Maximum subarray: `[4, -1, 2, 1]`
   - Sum: `6`.

## Why O(n) Complexity?

The algorithm runs in **O(n)** time because it:
1. Iterates through the array exactly once.
2. Performs constant-time operations (comparisons and updates) for each element.

No nested loops or additional traversals are required, ensuring optimal performance.
Thus, the algorithm efficiently finds the solution in linear time, making it ideal for large arrays.

## License

This project is licensed under the MIT License.
