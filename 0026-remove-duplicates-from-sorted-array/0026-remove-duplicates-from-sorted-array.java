class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer,Integer> dict=new LinkedHashMap<>();
        for(int n : nums)
        {
            dict.put(n,dict.getOrDefault(n,0)+1);
        }
        int index=0;
        for(int n: dict.keySet())
        {
            nums[index]=n;
            index++;
        }
        return index; 
    }
}