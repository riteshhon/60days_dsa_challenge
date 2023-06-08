import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Copy elements in HashMap
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Searching element
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // 2
            int remNum = target - num; // 9 - 2 = 7
            if (map.containsKey(remNum)) {
                int remIndex = map.get(remNum); // index of 7
                if (i == remIndex)
                    continue; // Skil below flow if the 2 index are duplicate in input
                return new int[] { i, remIndex };
            }
        }
        return new int[] {};
    }
}