class Solution 
{
    public int maxDistance(int[] position, int m) 
    {
        Arrays.sort(position);

        int low=1;
        int high=position[position.length-1]-position[0];

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(canWePlace(position,mid,m)==true)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return high;
    }

    public boolean canWePlace(int position[],int distance,int m)
    {
        int balls=1;
        int last=position[0];

        for(int n:position)
        {
            if(n-last>=distance)
            {
                balls++;
                last=n;
            }

            if(balls>=m)
            {
                return true;
            }
        }
        return false;
    }
}