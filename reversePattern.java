public class reversePattern{
    public static void main(String[] args)
    {
        int n=4;
        int num;
        for(int i=0;i<n;i++)
        {
             num=1;
            for(int j=i+1;j>0;j--)
            {
             System.out.print(+j +" ");
             num++;
            }
            System.out.println();
        }
    }
}
