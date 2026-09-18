class Solution 
{
    public int[] findPeakGrid(int[][] mat) 
    {
        int row=mat.length;
        int column=mat[0].length;
        int low=0;
        int high=column-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int maxRowIndex=maxElement(mat,row,mid);
            int left=-1;
            int right=-1;

            if(mid-1>=0)
            {
                left=mat[maxRowIndex][mid-1];
            }
            if(mid+1<column)
            {
                right=mat[maxRowIndex][mid+1];
            }

            int element=mat[maxRowIndex][mid];
            if(element>left && element>right)
            {
                return new int[]{maxRowIndex,mid};
            }
            else if(element<left)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    public int maxElement(int [][]mat,int row,int column)
    {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<row;i++)
        {
            if(mat[i][column]>max)
            {
                max=mat[i][column];
                index=i;
            }
        }
        return index;
    }
}