/**
 * LEETCODE Problem #1 - Two Sum
 * 
 * Problem Statement:
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * Approach: Using HashMap for efficient lookup
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(n) - HashMap stores at most n elements
 */
import java.util.*;

class Solution {
    /**
     * Finds two numbers in the array that add up to the target value
     * 
     * @param nums   Array of integers to search through
     * @param target The target sum we're looking for
     * @return       Array containing indices of the two numbers that sum to target
     */
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        // Key: number value, Value: index in the array
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array once
        for (int i = 0; i < nums.length; i++) {
            // Calculate what number we need to reach the target
            // complement + nums[i] = target
            int complement = target - nums[i];
            
            // Check if we've already seen the complement in previous iterations
            // If yes, we found our pair!
            if (map.containsKey(complement)) {
                // Return the index of complement and current index
                return new int[] {map.get(complement), i};
            }
            
            // Store the current number and its index for future lookups
            // This allows us to find it when we encounter its complement later
            map.put(nums[i], i);
        }
        
        // No solution found (should not happen per problem constraints)
        return new int[]{};
    }
}
