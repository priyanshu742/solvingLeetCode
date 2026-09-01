class Solution 
{
    public int findPeakElement(int[] arr) 
    {
        int low=1;
        int high=arr.length-2;
        if(arr.length==1)
        {
            return 0;
        }
        if(arr[0]>arr[1])
        {
            return 0;
        }
        if(arr[arr.length-2]<arr[arr.length-1])
        {
            return arr.length-1;
        }

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid])
            {
                return mid;
            }
            else if(arr[mid-1]>arr[mid])
            {
                high=mid-1;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            } 
        }
        return-1;
    }
}