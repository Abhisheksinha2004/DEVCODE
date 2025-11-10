public class constructor{
    public static void main(String[] args)
    {
        Complex r=new Complex(4,5);
        r.print();
        Complex m=new Complex(6,8);
        m.print();
        System.out.println("Adding two numbers");
       Complex rus= r.add(m);
       rus.print();


    }
}
class Complex{
    int a;
    int b;
    public Complex(int real,int imaginary)
    {
        a=real;
        b=imaginary;  //properties can be changed through constructor
    }
    void print()
    {
        System.out.println(a+"+"+b+"i");
    }
    Complex add(Complex m)
    {
        Complex newnum=new Complex(a+m.a,b+m.b);
        return newnum;

    }

}
