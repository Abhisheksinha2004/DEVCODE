import java.util.Scanner;
public class fibonaci{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        System.out.println("Enter the the number n =");
        int n=sc.nextInt();
        int temp,s=0;
        
        for(int i=1;i<=n;i++){
             System.out.println("a="+a);
        temp=a+b;
        a=b;
        b=temp;
        s+=i;

        }
        System.out.println("sum="+s);
    }
}

