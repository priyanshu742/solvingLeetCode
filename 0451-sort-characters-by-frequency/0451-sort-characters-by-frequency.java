class Solution 
{
    public String frequencySort(String s) 
    {
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> dict=new HashMap<>();
        List<Character> arr[]=new ArrayList[s.length()+1];
        for(char c : s.toCharArray())
        {
            dict.put(c,dict.getOrDefault(c,0)+1);
        }
        for(char c : dict.keySet())
        {
            int frequency=dict.get(c);
            if(arr[frequency]==null)
            {
                arr[frequency]=new ArrayList<>();
            }
            arr[frequency].add(c);
        }
        for(int i=arr.length-1;i>=1;i--)
        {
            if(arr[i]!=null)
            {
                 for(Character c : arr[i])
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