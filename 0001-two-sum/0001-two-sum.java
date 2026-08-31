class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> dict=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int prefixSum=target-nums[i];
            if(dict.containsKey(prefixSum))
            {
               return new int[]{i,dict.get(prefixSum)};
            }
            dict.put(nums[i],i);
        }
        return arr;
    }
}