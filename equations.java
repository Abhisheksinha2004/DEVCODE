import java.util.Scanner;
public class equations{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the choice");
        int choice=sc.nextInt();
        System.out.println("1. to find s");
        System.out.println("2. to find v");
           System.out.println("Enter the the time");
        float t=sc.nextFloat();
        System.out.println("Enter the intitial speed");
         double u=sc.nextDouble();
        
        switch(choice)
        {
            case 1:
            double a=9.8;
            double s=u*t+(1/2)*a*t*t;
            System.out.println("The value of s is "+s);
            break;
            case 2:
            a=9.8;
            double v=u+a*t;
            System.out.println("The value of v is"+v);
        }
        
    }

}
