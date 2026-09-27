class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String check=s.toLowerCase().replaceAll("[^a-z0-9]","");
        char []charArray=check.toCharArray();

        return check.equals(reverse(charArray,0,check.length()-1));
    }
    public String reverse(char[]arr ,int low,int high)
    {
        if(low>=high)
        {
            return new String(arr);
        }
        else
        {
            char temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            return reverse(arr,low+1,high-1);
        } 
    }   
}