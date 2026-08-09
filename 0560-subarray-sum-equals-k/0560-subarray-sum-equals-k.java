class Solution 
{
    //OPTIMAL
    
    public int subarraySum(int[] nums, int k) 
    {
        Map<Integer,Integer> dict=new HashMap<>();
        int sum=0;
        int total=0;

        dict.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];

            int prefixSum=sum-k;
            if(dict.containsKey(prefixSum))
            {
                total=total+dict.get(prefixSum);
            }
            
            dict.put(sum,dict.getOrDefault(sum,0)+1);
        }
        return total;
    }
}