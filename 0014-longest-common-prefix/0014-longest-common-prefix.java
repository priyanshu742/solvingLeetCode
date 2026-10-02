class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int i=0;
        while(i<strs[0].length())
        {
            String check=strs[0].substring(0,i+1);
            int flag=0;
            for(int j=1;j<strs.length;j++)
            {
                if(!strs[j].startsWith(check))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}
