class Solution 
{
    public static int findKthPositive(int[] arr, int k) 
    {
        int low=1;
        int maxVal=Integer.MIN_VALUE;
        int ans=0;
        

        for(int n:arr)
        {
            maxVal=Math.max(maxVal,n);
        }
        int high=maxVal+k;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(calculate(arr,mid)>=k)
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

    public static int calculate(int arr[],int mid)
    {
        int count=0;
        for(int n: arr)
        {
            if(n<=mid)
            {
                count++;
            }
        }
        return mid-count;
    }
}