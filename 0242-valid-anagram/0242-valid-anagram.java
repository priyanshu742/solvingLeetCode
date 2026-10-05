class Solution 
{
    public boolean isAnagram(String s, String t) 
    {

        // better
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Integer> mapS=new HashMap<>();
        Map<Character,Integer> mapT=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }
        for(char ch : mapS.keySet())
        {
            if(!mapT.containsKey(ch) || !mapS.get(ch).equals(mapT.get(ch)))
            {
                return false;
            }
        }
        return true;
    
    }
}
