
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> seenNumbers = new HashSet<> ();
         for (int num : nums){
            //check if the set contains the number or not
            if(seenNumbers.contains(num)){
                return true; //returns true because duplicate found
            }
            //add element top hashset
            seenNumbers.add(num);
         }
         return false;



             }
}