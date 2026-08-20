class Solution 
{
    public int maxProduct(int[] nums) 
    {
        // optimal kadane's algorithm
        int maximum=nums[0];
        int currentMax=nums[0];
        int currentMin=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp=currentMax;
                currentMax=currentMin;
                currentMin=temp;
            }
            currentMax=Math.max(nums[i],currentMax*nums[i]);
            currentMin=Math.min(nums[i],currentMin*nums[i]);

            maximum=Math.max(maximum,currentMax);
        }
        return maximum;
    }
}