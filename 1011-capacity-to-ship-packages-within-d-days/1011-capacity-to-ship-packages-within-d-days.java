class Solution 
{
    public int shipWithinDays(int[] weights, int days) 
    {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int n: weights)
        {
            if(n>low)
            {
                low=n;
            }
            high=high+n;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;       
            int requiredDays=calc(weights,mid);

            if(requiredDays<=days)
            {
                high=mid-1;
            }
            else if(requiredDays>days)
            {
                low=mid+1;
            }
        }
        return low;
    }

    public int calc(int[] weights,int capacity) 
    {
        int day=1;
        int load=0;
        for(int n : weights)
        {
            if(load+n>capacity)
            {
                day++;
                load=n;
            }
            else
            {
                load=load+n;
            }
        }
        return day;
    }
}