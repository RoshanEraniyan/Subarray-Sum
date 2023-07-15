import java.util.*;

class Solution
{
    public void subarraysum(int[] array)
    {
        int total=0;
        for(int i=0;i<array.length;i++)
        {
            int sum=0;
            for(int j=i;j<array.length;j++)
            {
                sum+=array[j];
                total+=sum;
            }
        }
        System.out.println(total);

    }
}

class SubArraySum
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.subarraysum(array);
    }
}
