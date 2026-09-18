class Solution 
{
    // brute
    public int findPeakElement(int[] arr) 
    {
        int high=arr.length;
        if(high==1)
        {
            return 0;
        }
        if(arr[0]>arr[1])
        {
            return 0;
        }
        if(arr[high-2]<arr[high-1])
        {
            return high-1;
        }
        for(int i=1;i<high-1;i++)
        {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                return i;
            }
        }  
        return -1;
    }
}