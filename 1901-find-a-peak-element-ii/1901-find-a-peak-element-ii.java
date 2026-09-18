class Solution 
{
    public int[] findPeakGrid(int[][] mat) 
    {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int maxRowIndex=maxElement(mat,mid);
            int left=-1;
            int right=-1;

            if(mid-1>=0)
            {
                left=mat[maxRowIndex][mid-1];
            }
            if(mid+1<m)
            {
                right=mat[maxRowIndex][mid+1];
            }

            if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right)
            {
                return new int[]{maxRowIndex,mid};
            }
            else if(mat[maxRowIndex][mid]<left)
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

    public int maxElement(int [][]mat,int column)
    {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<mat.length;i++)
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