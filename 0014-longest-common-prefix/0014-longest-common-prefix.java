class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs==null || strs.length==0)
        {
            return "";
        }
        int low=0;
        int ans=0;
        int high=Integer.MAX_VALUE;
        for(String s : strs)
        {
            if(s.length()<high)
            {
                high=s.length();
            }
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isCommonPrefix(strs,mid))
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return strs[0].substring(0,ans);
    }
    public boolean isCommonPrefix(String[] strs,int mid)
    {
        String check=strs[0].substring(0,mid);
        for(int i=1;i<strs.length;i++)
        {
            if(!strs[i].startsWith(check))
            {
                return false;
            }
        }
        return true;
    } 
}

