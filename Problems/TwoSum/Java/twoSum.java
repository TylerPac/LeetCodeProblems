class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] SumValues = new int[2];
        Map<Integer, Integer> CheckSum = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int WantedValue = target - nums[i];
            
            if (CheckSum.containsKey(WantedValue)) {
                SumValues[0] = CheckSum.get(WantedValue);
                SumValues[1] = i;
                return SumValues;
            }
            CheckSum.put(nums[i], i);

        }
        
        return SumValues;
    }
}