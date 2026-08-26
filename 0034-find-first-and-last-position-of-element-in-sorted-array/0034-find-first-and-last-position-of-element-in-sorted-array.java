class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int size=nums.length;
        int lb=lowerBound(nums,size,target);
        
        if(lb==size || nums[lb]!=target)
        {
            return new int[]{-1,-1};
        }

        return new int[]{lb,upperBound(nums,size,target)-1};
    }

    public int lowerBound(int nums[],int size,int target)
    {
        int low=0;
        int high=size-1;
        int ans=size;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }

    public int upperBound(int nums[],int size,int target)
    {
        int low=0;
        int high=size-1;
        int ans=nums.length;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}