class Solution 
{
    public double myPow(double x, int n) 
    {
        long N=n;
        if(N<0)
        {
            N=-N;
        }
        double ans=1;
        while(N>0)
        {
            if(N%2==1)
            {
                ans=ans*x;
                N=N-1;
            }
            else if(N%2==0)
            {
                N=N/2;
                x=x*x;
            }
        }
        if(n<0)
        {
            ans=1/ans;
        }
        return ans;
    }
}