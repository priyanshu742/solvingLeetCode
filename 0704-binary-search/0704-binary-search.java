class Solution 
{
    public int search(int[] nums, int target) 
    {
        // recursive approach
        int size=nums.length-1;
        return binarySearch(nums,0,size,target);
    }
    public int binarySearch(int nums[],int low,int high,int target)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=low+(high-low)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(target>nums[mid])
        {
            return binarySearch(nums,mid+1,high,target);
        }
        else if(target<nums[mid])
        {
            return binarySearch(nums,low,mid-1,target);
        }
        return -1;
    }
}