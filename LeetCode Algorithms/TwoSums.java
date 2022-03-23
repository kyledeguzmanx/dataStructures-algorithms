import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array = new HashMap<>();
        
        //convert array to hashmap
        for(int i=0; i<nums.length; i++){ //we use hashmap for indexOf function
            array.put(nums[i], i);
        }
    }
}
