import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array = new HashMap<>();
        
        //convert array to hashmap
        for(int i=0; i<nums.length; i++){ //we use hashmap for indexOf function
            array.put(nums[i], i);
        }
        
         //find matchings
        for(int i=0; i<nums.length; i++){
            if(array.containsKey(target-nums[i]) && array.get(target-nums[i]) != i){
                int[] returnArr = new int[]{i, array.get(target-nums[i])};
                return returnArr;
            }
        }  
    }
}
