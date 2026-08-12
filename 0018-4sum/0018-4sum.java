class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        // Better
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                Set<Long> temp=new HashSet<>();
                for(int k=j+1;k<nums.length;k++)
                {
                    long sum=(long)nums[i]+nums[j]+nums[k];
                    long fourth=(long)target-(sum);
                    if(temp.contains(fourth))
                    {
                        List<Integer> ans=Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(ans);
                        result.add(ans);
                    }
                    temp.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}