class Solution 
{
    public int majorityElement(int[] nums) 
    {
        Map<Integer,Integer> dict=new HashMap<>();

        for(int n:nums)
        {
            dict.put(n,dict.getOrDefault(n,0)+1);
        }
        int maxFreq=0;
        int major=0;

        for(int key : dict.keySet())
        {
            if(dict.get(key)>maxFreq)
            {
                maxFreq=dict.get(key);
                major=key;
            }
        }   
        return major;
    }
}