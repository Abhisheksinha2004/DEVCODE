public class opps{
    public static void main(String[] args)
    {
        Dog d1=new Dog();
        d1.name="jjhb";
        Dog d2=new Dog();
        d2.name="defdsf";
        d1.walk();
        d1.bark();
        d2.walk();
        d2.bark();


    }
}
class Dog{
    // properties:
    String name;
    int age;
    String color;
    void walk()
    {
        System.out.println(name+"is walikng");
    }
    void bark()
    {
        System.out.println(name+"is barking");
    }

}
