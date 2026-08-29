class Solution 
{
    public int findMin(int[] nums) 
    {

        int low=0;
        int high=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high)
        {
            /* 
            If the search space is already sorted
            then always arr.get(low) will be smaller
            in the search space 
            */
            if(nums[low]<=nums[high])
            {
                min=Math.min(min,nums[low]);
                break;
            }
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid])
            {
                min=Math.min(nums[low],min);
                low=mid+1;
            }
            else
            {
                min=Math.min(nums[mid],min);
                high=mid-1;
            }
        }
        return min;
    }
}
