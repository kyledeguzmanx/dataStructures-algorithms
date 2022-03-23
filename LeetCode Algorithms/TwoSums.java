import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array = new HashMap<>();
        
        for(int i : nums){
            array.put(nums[i], i);
        }
        
        for(int i : nums){
            if(array.containsKey(target-nums[i]) && array.get(target-nums[i]) != i){
                int [] returnArr = new int[]{i, array.get(target-nums[i])};
                return returnArr;
            }
        }
    }
}
