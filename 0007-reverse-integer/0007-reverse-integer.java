class Solution {
    public int reverse(int x) 
    {
        int num=x;
        long rev=0;
        int digit=0;

        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+ digit;
            num=num/10;
        }

        if (rev<Math.pow(-2,31) || rev>(Math.pow(2,31)-1))
            return 0;
        else 
            return (int)rev;
    }
}