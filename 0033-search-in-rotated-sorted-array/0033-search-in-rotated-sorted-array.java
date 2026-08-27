class Solution 
{
    public int search(int[] nums, int k) 
    {
        if(nums.length==0 || nums.length==1)
        {
            if(nums[0]==k)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        int low=0;
        int high=nums.length-1;
        int count=0;
        int ans=-1;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<=nums[i+1])
            {
                count++;
            }
            else
            {
                break;
            }
        }

        int intermediate=count;
        while(low<=intermediate)
        {
            int mid=low+(intermediate-low)/2;
            if(nums[mid]==k)
            {
                return mid;
            }
            else if(nums[mid]<k)
            {
                low=mid+1;
            }
            else
            {
                intermediate=mid-1;
            }
        }
        if(count<nums.length)
        {
            int midHigh=count+1;
            while(midHigh<=high)
            {
                int mid=midHigh+(high-midHigh)/2;
                if(nums[mid]==k)
                {
                    return mid;
                }
                else if(nums[mid]<k)
                {
                    midHigh=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return ans;
    }
}