import java.util.Scanner;
public class average{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number a ");
        int a=sc.nextInt();
         System.out.println("Enter the number b ");
        int b=sc.nextInt();
        int ot=average(a,b);
        System.out.println(+ot);

    }
    public static int average(int a,int b)
    {
        int avg=(a+b)/2;
        return avg;
    }
    
}
