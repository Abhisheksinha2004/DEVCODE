import java.util.Scanner;
public class string {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
String name;
System.out.println("Enter the Name");
name= sc.nextLine();
String rev="";
for(int i=name.length()-1;i>=0;i--)
{
    rev=rev+name.charAt(i);
}
System.out.println("Reversed string: " +rev);
    }
}
