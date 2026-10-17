class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // optimal
        Map<Integer,Integer> record=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int prefix=target-nums[i];
            if(record.containsKey(prefix))
            {
                return new int[]{i,record.get(prefix)};
            }
            record.put(nums[i],i);
        }
        return new int[]{}; // dummy return; 
    }
}