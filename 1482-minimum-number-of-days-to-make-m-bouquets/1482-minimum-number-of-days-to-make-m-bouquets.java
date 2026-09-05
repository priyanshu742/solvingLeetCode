class Solution 
{
    public int minDays(int[] bloomDay, int m, int k) 
    {
        if(bloomDay.length<(long)k*m)
        {
            return -1;
        }

        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int x:bloomDay)
        {
            high=Math.max(high,x);
            low=Math.min(low,x);
        }

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int bouquets=possible(bloomDay,mid,k,bloomDay.length);

            if(bouquets>=m)
            {
                high=mid-1;
            }
            else if(bouquets<m)
            {
                low=mid+1;
            }
        }
        return low;
    }

    public int possible(int bloomDay[],int day,int group,int size)
    {
        int count=0;
        int bouquets=0;
        for(int i=0;i<size;i++)
        {
            if(bloomDay[i]<=day)
            {
                count++;
            }
            else
            {
                bouquets=bouquets+(count/group);
                count=0;
            }
        }
        bouquets=bouquets+(count/group);
        return bouquets;
    }
}
        