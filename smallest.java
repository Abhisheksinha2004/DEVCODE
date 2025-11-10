import java.util.Scanner;
public class smallest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]={1,34,5,-5};
        int min =Integer.MAX_VALUE;
        for(int number:a)
        {
            if(number<min)
            {
                min=number;
            }
            
        }
        System.out.println(+min);

    }

}