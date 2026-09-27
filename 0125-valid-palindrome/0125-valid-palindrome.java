class Solution 
{
    public boolean isPalindrome(String s) 
    {
        // string new=s.toLowerCase().replaceAll("[^a-z0-9]","")
        return check(s,0,s.length()-1);
    }
    public boolean check(String s,int low,int high)
    {
        if(low>=high)
        {
            return true;
        }
        char left=s.charAt(low);
        char right=s.charAt(high);
        if(!Character.isLetterOrDigit(left))
        {
            return check(s,low+1,high);
        }
        if(!Character.isLetterOrDigit(right))
        {
            return check(s,low,high-1);
        }
        if(Character.toLowerCase(left)!=Character.toLowerCase(right))
        {
            return false;
        }
        return check(s,low+1,high-1);
    }   
}