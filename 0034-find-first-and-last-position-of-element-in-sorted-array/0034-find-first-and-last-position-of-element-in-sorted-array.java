class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int size=nums.length;
        int first=firstOccurence(nums,size,target);
        if(first==-1)
        {
            return new int[]{-1,-1};
        }
        return new int[]{first,lastOccurence(nums,size,target)};
    }

    int firstOccurence(int nums[],int size,int target)
    {
        int low=0;
        int high=size-1;
        int first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;    
            }
        }
        return first;
    }
    int lastOccurence(int nums[],int size,int target)
    {
        int low=0;
        int high=size-1;
        int last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return last;
    }
}