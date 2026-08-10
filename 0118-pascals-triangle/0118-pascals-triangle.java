class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ans.add(ncr(i));
        }
        return ans;
    }

    public List<Integer> ncr(int n)
    {
        int result=1;
        List<Integer> pseudo= new ArrayList<>();
        pseudo.add(1);
        for(int i=0;i<n;i++)
        {
            result=result*(n-i);
            result=result/(i+1);
            pseudo.add(result);
        }
        return pseudo;
    } 
}