public class inheritance2 extends inheritance1 {
    void start()
    {
        
        System.out.println("Car is starting");
        System.out.println(this);
         System.out.println(this.model);
             System.out.println(this.WheelsCount);
         super.start();
    }
    public static void main(String[] args)
    {
        inheritance2 obj=new  inheritance2();
        obj.WheelsCount=9;
        obj.model="harier";
        obj.start();
       

    }
    inheritance2()
    {
        System.out.println("car is being created");
    }
    
}
