class Solution 
{
    public int reversePairs(int[] nums) 
    {
        return mergeSort(nums,0,nums.length-1); 
    }

    public int mergeSort(int[] nums,int low,int high) 
    {
        int count=0;
        if(low>=high)
        {
            return count;
        }
        int mid=(low+high)/2;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }

    public int countPairs(int[] nums,int low,int mid,int high)
    {
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && (long)nums[i]>2*
            (long)nums[right])
            {
                right++;
            }
            count=count+(right-(mid+1));
        }
        return count;
    } 

    public void merge(int[] nums,int low,int mid,int high) 
    {
        int index=0;
        int left=low;
        int right=mid+1;
        int temp[]=new int[high-low+1];

        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                temp[index]=nums[left];
                left++;
                index++;
            }
            else
            {
                temp[index]=nums[right];
                right++;
                index++;
            }
        }
        while(left<=mid)
        {
            temp[index]=nums[left];
            index++;
            left++;
        }
        while(right<=high)
        {
            temp[index]=nums[right];
            index++;
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            nums[i]=temp[i-low];
        }
    }
}