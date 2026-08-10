class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        // Brute
        int size=nums.length;
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                if(nums[j]==nums[i])
                {
                    count++;
                }
            }
            if(count>size/3 && !arr.contains(nums[i]))
            {
                arr.add(nums[i]);
            }
            if(arr.size()==2)
            {
                break;
            }
        }
        return arr;     
    }
}