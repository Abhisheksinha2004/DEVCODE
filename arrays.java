import java.util.Scanner;
public class arrays{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int arrayss[]=new int[20];//allocating memmory to arrays in java
        arrayss[0]=33;
        arrayss[1]=332;
        System.out.println(arrayss[0]);
        System.out.println(arrayss.length);
        String names[]={"ram","dssf","jdj","jdhjg"};
        for(String name:names)
        {
            System.out.println("name is "+name);
        }
    }
}