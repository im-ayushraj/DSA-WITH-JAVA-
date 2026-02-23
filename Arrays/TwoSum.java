//LEETCODE 1 
//TWO SUM
// APPROACH: USING HASHMAP
//TIME COMPLEXITY = O(n)
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a hashmap to store numbers and their indices
        Map<Integer,Integer>map= new HashMap<>();
        //iterate through the array

        for(int i=0;i<nums.length;i++){
            //calculate the complement of the current number
            int complement= target - nums[i];

            //check if the complement is already in the hashmap
            if(map.containsKey(complement)){

                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);





        }
        return new int[]{};
        
    }
}
