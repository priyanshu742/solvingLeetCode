class Solution 
{
    public int countPrimes(int n) 
    {
        // false means prime
        // true means not prime;
        if(n<=2)
        {
            return 0;
        }
        int count=0;
        boolean prime[]=new boolean[n];
        for(int i=2;i*i<n;i++)
        {
            if(!prime[i])
            {
                for(int j=i*i;j<n;j=j+i)
                {
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(!prime[i])
            {
                count++;
            }
        }
        return count;
    }
}