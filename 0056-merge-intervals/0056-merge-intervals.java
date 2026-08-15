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

        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            if(result.isEmpty() || intervals[i][0]>result.get(result.size()-1).get(1))
            {
                result.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            else
            {
               int currentMaxEnd=Math.max(intervals[i][1],result.get(result.size()-1).get(1));
               result.get(result.size()-1).set(1,currentMaxEnd);
            }
        }
        int [][] main=new int [result.size()][2];
        for(int i=0;i<result.size();i++)
        {
            main[i][0]=result.get(i).get(0);
            main[i][1]=result.get(i).get(1);
        }
        return main;
    }
}
    