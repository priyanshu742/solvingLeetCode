class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        // optimal
        int count=0;
        int sum=0;
        Map<Integer,Integer> dict=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum==k)
            {
                count++;
            }
            int prefix=sum-k;
            if(dict.containsKey(prefix))
            {
                count=count+dict.get(prefix);
            }
            dict.put(sum,dict.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}