public class as {
        public static void main(String[] args)
    {
        Complex r=new Complex(4,5);
        Complex s=new Complex(7,3);
        r.print();
        s.print();

    }
}
class Complex{
    int a;
    int b;
    public Complex(int real,int imaginary)
    {
        a=real;
        b=imaginary;
    }
    void print()
    {
        System.out.println(a+"+"+b+"i");
    }

}
    

