class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        if(s.length()!=goal.length())
        {
            return false;
        }
        if(s.length()==0)
        {
            return true;
        }
        int l=s.length();
        int counter=l;
        char arr[]=s.toCharArray();
        while(counter!=0)
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
            counter--;
        }
        return false;
    }
}