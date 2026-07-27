class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int uniquecount=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[uniquecount]=nums[i];
                uniquecount++;
            }
        }
        return uniquecount;
    }
}