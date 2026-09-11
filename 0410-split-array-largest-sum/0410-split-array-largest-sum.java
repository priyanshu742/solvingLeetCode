class Solution 
{
    public int splitArray(int[] nums, int k) 
    {
        int low=Integer.MIN_VALUE;
        int high=0;

        for(int n:nums)
        {
            if(n>low)
            {
                low=n;
            }
            high=high+n;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int count=countSum(nums,mid);

            if(count<=k)
            {
                high=mid-1;
            }
            else if(count>k)
            {
                low=mid+1;
            }
        }
        return low;
    }
    public int countSum(int nums[],int limit)
    {
        int count=1;
        int total=0;
        for(int n:nums)
        {
            if(total+n>limit)
            {
                count++;
                total=n;
            }
            else
            {
                total=total+n;
            }
        }
        return count;
    }
}