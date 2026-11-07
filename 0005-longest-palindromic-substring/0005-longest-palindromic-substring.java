class Solution 
{
    public String longestPalindrome(String s) 
    {
        // optimal
        int maxLen=0;
        String longest="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            // odd length
            int left=i;
            int right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right))
            {
                if(right-left+1>maxLen)
                {
                    maxLen=right-left+1;
                    longest=s.substring(left,right+1);
                }
                left--;
                right++;
            }
            // even length
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right))
            {
                if(right-left+1>maxLen)
                {
                    maxLen=right-left+1;
                    longest=s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        return longest;
    }
}