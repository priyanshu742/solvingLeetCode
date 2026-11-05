class Solution 
{
    public int romanToInt(String s) 
    {
        int ans=0;
        HashMap<Character,Integer> value=new HashMap<>();
        value.put('I',1);
        value.put('V',5);
        value.put('X',10);
        value.put('L',50);
        value.put('C',100);
        value.put('D',500);
        value.put('M',1000);
        for(int i=0;i<s.length()-1;i++)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            int v1=value.get(c1);
            int v2=value.get(c2);
            if(v1<v2)
            {
                ans=ans-v1;
            }
            else
            {
                ans=ans+v1;
            }
        }
        ans=ans+value.get(s.charAt(s.length()-1));
        return ans;
    }
}