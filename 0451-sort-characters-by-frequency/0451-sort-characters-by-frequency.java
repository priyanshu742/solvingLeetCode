class Solution 
{
    public String frequencySort(String s) 
    {
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> dict=new HashMap<>();
        List<Character> bucket[]=new ArrayList[s.length()+1];
        for(char c : s.toCharArray())
        {
            dict.put(c,dict.getOrDefault(c,0)+1);
        }
        for(char c : dict.keySet())
        {
            int frequency=dict.get(c);
            if(bucket[frequency]==null)
            {
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(c);
        }
        for(int i=bucket.length-1;i>=1;i--)
        {
            if(bucket[i]!=null)
            {
                 for(Character c : bucket[i])
                {
                    for(int j=0;j<i;j++)
                    {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString(); 
    }
}