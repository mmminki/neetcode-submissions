
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) continue;
            map.put(nums[i], i);
        }
        int targetVal = 0;
        int idx = 0;
        for(int j=0; j<nums.length; j++) {
            int complement = target - nums[j];
            if(map.get(complement) == null || map.get(complement) == j) continue;
            targetVal = map.get(complement);
            idx = j;
            break;
        }
        int first = Math.min(idx, targetVal);
        int second = Math.max(idx, targetVal);
        return new int[]{first, second};
    }
}
