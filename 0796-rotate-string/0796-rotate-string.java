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
        int n=s.length();
        StringBuilder str=new StringBuilder(s);
        while(n!=0)
        {
            char ch=str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);
            if(str.toString().equals(goal))
            {
                return true;
            }
            n--;
        }
        return false;
    }
}