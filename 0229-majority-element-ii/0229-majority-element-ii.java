class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int reqFrequency=nums.length/3;
        Map<Integer,Integer> dict= new HashMap<>();
        List<Integer> arr=new ArrayList<>();

        for(int n: nums)
        {
            dict.put(n,dict.getOrDefault(n,0)+1);
        }

        for(int key: dict.keySet())
        {
            if(dict.get(key)>reqFrequency)
            {
                arr.add(key);
            }
        }
        return arr;
        
    }
}