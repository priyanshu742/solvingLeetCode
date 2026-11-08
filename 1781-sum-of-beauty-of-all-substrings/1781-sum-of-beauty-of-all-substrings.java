class Solution 
{
    public int beautySum(String s) 
    {
        // optimal
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                char c=s.charAt(j);
                freq[c-'a']++;
                total=total+calculateBeauty(freq);
            }
        }
        return total;
    }
    public int calculateBeauty(int []freq) 
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                if(freq[i]>max)
                {
                    max=freq[i];
                }
                if(freq[i]<min)
                {
                    min=freq[i];
                }
            }
        }
        return max-min;
    }
}