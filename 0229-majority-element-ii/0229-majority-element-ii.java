class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        // optimised
        int reqFrequency=nums.length/3;
        Map<Integer,Integer> dict= new HashMap<>();
        List<Integer> arr=new ArrayList<>();

        for(int n: nums)
        {
            dict.put(n,dict.getOrDefault(n,0)+1);
            if(dict.get(n)>reqFrequency && !arr.contains(n))
            {
                arr.add(n);
            }
            if(arr.size()==2)
            {
                break;
            }
        }
        return arr; 
    }
}