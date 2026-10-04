class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        int n=goal.length();
        int l=s.length();
        char arr[]=s.toCharArray();
        while(n!=0)
        {
            char last=arr[0];
            for(int i=0;i<l-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[l-1]=last;
            if(new String(arr).equals(goal))
            {
                return true;
            }
            n--;
        }
        return false;
    }
}