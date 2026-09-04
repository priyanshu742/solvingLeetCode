class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int max=Integer.MIN_VALUE;
        for(int n: piles)
        {
           max=Math.max(n,max);
        }

        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long totalHours=0;

            for(int n: piles)
            {
                totalHours=totalHours+((long)n+mid-1)/mid;
            }

            if(totalHours<=h)
            {                    
                high=mid-1;
            }
            else if(totalHours>h)
            {
                low=mid+1;
            }
        }
        return low;
    }
}