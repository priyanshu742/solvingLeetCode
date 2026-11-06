class Solution 
{
    public int myAtoi(String s) 
    {
        int start=0;
        long ans=0;
        int sign=1;
        while(start<s.length() && s.charAt(start)==' ')
        {
            start++;
        }
        if(start<s.length() && (s.charAt(start)=='+' || s.charAt(start)=='-'))
        {
            if(s.charAt(start)=='+')
            {
                sign=1;
            }
            else
            {
                sign=-1;
            }
            start++;
        }
        for(int i=start;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                ans=ans*10+(s.charAt(i)-'0');
                if(ans*sign>Integer.MAX_VALUE)
                {
                    return Integer.MAX_VALUE;
                }
                if(ans*sign<Integer.MIN_VALUE)
                {
                    return Integer.MIN_VALUE;
                }
            }
            else
            {
                break;
            }
        }
        return (int)(ans*sign); 
    }
}