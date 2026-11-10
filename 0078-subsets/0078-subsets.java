class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<Integer> currentSubset=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        generateSubset(nums,0,currentSubset,result);
        return result;
    }
    public void generateSubset(int[] nums,int index,List<Integer> currentSubset,List<List<Integer>> result)
    {
        if(index>=nums.length)
        {
            result.add(new ArrayList<> (currentSubset));
            return ;
        }
        currentSubset.add(nums[index]);
        generateSubset(nums,index+1,currentSubset,result);
        currentSubset.remove(currentSubset.size()-1);
        generateSubset(nums,index+1,currentSubset,result);
    } 
}
