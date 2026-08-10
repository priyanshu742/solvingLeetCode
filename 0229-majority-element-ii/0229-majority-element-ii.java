class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        // maximum optimised solution
        int reqFrequency=nums.length/3;
        int count1=0;
        int count2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;

        List<Integer> arr=new ArrayList<>();

        for(int n: nums)
        {
            if(count1==0 && n!=element2)
            {
                count1=1;
                element1=n;
            }
            else if(count2==0 && n!=element1)
            {
                count2=1;
                element2=n;
            }
            else if(n==element1)
            {
                count1++;
            }
            else if(n==element2)
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0; 
        for(int n:nums)
        {
            if(element1==n)
            {
                count1++;
            }
            if(element2==n)
            {
                count2++;
            }
        }

        if(count1>reqFrequency)
        {
            arr.add(element1);
        }            
        if(count2>reqFrequency)
        {
            arr.add(element2); 
        }
        return arr;     
    }
}