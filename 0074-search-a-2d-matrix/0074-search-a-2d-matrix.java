class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        // log n + log m
        int low1=0;
        int high1=matrix.length-1;

        while(low1<=high1)
        {
            int mid1=low1+(high1-low1)/2;
            int column=matrix[mid1].length-1;
    
            if(matrix[mid1][column]<target)
            {
                low1=mid1+1;
            }
            else if(matrix[mid1][0]>target)
            {
                high1=mid1-1;
            }
            else if(matrix[mid1][0]<=target && matrix[mid1][column]>=target)
            {
                int low2=0;
                int high2=matrix[mid1].length-1;
                while(low2<=high2)
                {
                    int mid2=low2+(high2-low2)/2;
                    if(target==matrix[mid1][mid2])
                    {
                        return true;
                    }
                    else if(target>matrix[mid1][mid2])
                    {   
                        low2=mid2+1;
                    }
                    else 
                    {      
                        high2=mid2-1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}

