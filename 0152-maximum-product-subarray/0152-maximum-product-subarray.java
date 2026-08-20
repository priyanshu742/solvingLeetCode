class Solution 
{
    public int maxProduct(int[] nums) 
    {
        // Brute
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=i;j<nums.length;j++)
            {
                product=product*nums[j];
                maximum=Math.max(product,maximum);
            }
        }
        return maximum;
    }
}