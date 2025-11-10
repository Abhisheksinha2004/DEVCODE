import java.util.Scanner;
public class TemperatureConversion{
     public static void main(String[] args)
     {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the choice ");
        System.out.println("1. f to c");
        System.out.println("2. c to f");
        int choice;
        System.out.println("Enter the choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
               System.out.printf("Enter the temperature in degree celcius ");

        float c=sc.nextFloat();
     float f;
        f=(c*9/5)+32;
        System.out.println("the temperature in farenheit is "
        +f);
        break;
        case 2:
        System.out.println("enter the temperature in fahrenheit");
        f=sc.nextFloat();
        
        c=(f-32)*5/9;
        System.out.println("the tempersture in celcius is "+c);
        break;
        default:System.out.println("Invalid choice");
        
        }

       


     }
    
}
