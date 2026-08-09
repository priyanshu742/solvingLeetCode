class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        // optimal approach
        //right -> bottom -> left -> top

        List<Integer> ans=new ArrayList<>();

        int rowLength=matrix.length;
        int columnLength=matrix[0].length;

        int left=0;
        int right=columnLength-1;
        int top=0;
        int bottom=rowLength-1;

        while(left<=right && top<=bottom)
        {
            // moving right
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;

            // moving bottom
            for(int i=top;i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;

            // moving left
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // moving top
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
   