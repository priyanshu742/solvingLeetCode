class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int res[]=new int[nums1.length+nums2.length];
        int index=0;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                res[index]=nums1[i];
                index++;
                i++;
            }
            else
            {
                res[index]=nums2[j];
                index++;
                j++;
            }
        }
        while(i<nums1.length)
        {
            res[index]=nums1[i];
            index++;
            i++;
        }
        while(j<nums2.length)
        {
            res[index]=nums2[j];
            index++;
            j++;
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