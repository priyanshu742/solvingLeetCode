class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals,(a,b) ->
        {
            if(a[0]==b[0])
            {
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });

        List<List<Integer>> result =new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!result.isEmpty() && end<=result.get(result.size()-1).get(1))
            {
                continue;
            }
            for(int j=i+1;j<intervals.length;j++)
            {
                if(intervals[j][0]<=end)
                {
                    end=Math.max(intervals[j][1],end);
                }
                else
                {
                    break;
                }
            }
            result.add(Arrays.asList(start,end));
        }
        int ans[][]=new int[result.size()][2];
        for(int i=0;i<result.size();i++)
        {
            ans[i][0]=result.get(i).get(0);
            ans[i][1]=result.get(i).get(1);
        }
        return ans;
    }
}
