class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int single=0;
        Map<Integer,Integer> dict=new HashMap<>();
        for(int n : nums)
        {
            dict.put(n,dict.getOrDefault(n,0)+1);
        }

        for(int n: dict.keySet())
        {
            if(dict.get(n)==1)
            {
                single=n;
                break;
            }
        }
        return single;
    }
}