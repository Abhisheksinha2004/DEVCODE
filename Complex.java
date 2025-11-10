public class Complex{
    public static void main(String[] args)
    {
        Comp n1=new Comp();
        n1.a=6;
        n1.b=3;
        n1.print();

    }

}
class Comp{
    int a;
    int b;
    void print()
    {
        System.out.println(a+"+"+b+"i");
    }

}
