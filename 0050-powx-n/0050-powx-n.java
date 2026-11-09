class Solution 
{
    public double myPow(double x, int n) 
    {
        long M=n;
        int negative=0;
        if(M<0)
        {
            M=-M;
            negative=1;
        }
        long ans=1;
        double result=pow(x,M,ans);
        if(negative==1)
        {
            result=1/result;
        }
        return result;
    }
    public double pow(double x, long M,double ans) 
    {
        if(M==0)
        {
            return ans;
        }
        if(M%2==1)
        {
            ans=ans*x;
            return pow(x,M-1,ans);
        }
        x=x*x;
        return pow(x,M/2,ans);
    }
}