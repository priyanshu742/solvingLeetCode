class Solution 
{
    public void nextPermutation(int[] nums) 
    {
        int size=nums.length;
        int index=-1;

        for(int i=size-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index == -1)
        {
            int start=0;
            int end=size-1;
            while(start<end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            return;
        }
        else
        {
            for(int i=size-1;i>index;i--)
            {
                if(nums[i]>nums[index])
                {
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
        }
        int start=index+1;
        int end=size-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}