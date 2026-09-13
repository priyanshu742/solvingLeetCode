class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int res[]=new int[nums1.length+nums2.length];
        int index=0;
        int m=0;
        int n=0;
        while(m<nums1.length && n<nums2.length)
        {
            if(nums1[m]<nums2[n])
            {
                res[index]=nums1[m];
                index++;
                m++;
            }
            else
            {
                res[index]=nums2[n];
                index++;
                n++;
            }
        }
        while(m<nums1.length)
        {
            res[index]=nums1[m];
            index++;
            m++;
        }
        while(n<nums2.length)
        {
            res[index]=nums2[n];
            index++;
            n++;
        }
        int len=res.length;
        if(len%2!=0)
        {
            return res[len/2];
        }
        int x=res[res.length/2];
        int y=res[(res.length/2)-1];
        return (x+y)/2.0;
    }
}