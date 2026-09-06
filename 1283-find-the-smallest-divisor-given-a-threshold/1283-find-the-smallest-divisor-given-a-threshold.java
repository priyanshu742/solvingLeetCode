class Solution 
{
    public int smallestDivisor(int[] nums, int threshold)
    {
        int low=1;
        int high=Integer.MIN_VALUE;

        for(int n: nums)
        {
            high=Math.max(n,high);
        }

        while(low<=high)
        {
            int total=0;
            int mid=low+(high-low)/2;
            for(int n : nums)
            {
                total=total+(n+mid-1)/mid;
            }

            if(total<=threshold)
            {
                high=mid-1;
            }
            else if(total>threshold)
            {
                low=mid+1;
            }
        }
        return low;
    }
}
