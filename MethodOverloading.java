public class MethodOverloading{
    public static void main(String[] args)
    {
        Greetings g=new Greetings();
        g.greeting("Abhishek");
        g.greeting("red",5);
       }
}
class Greetings{
    void greeting(String name)
    {
        System.out.println("Hello " +name+ ",good morning");
    }
    void greeting(String color,int count)
    {
        for(int i=0;i<=count;i++)
        {
            System.out.println("red is fav. color");
        }
    }
}
