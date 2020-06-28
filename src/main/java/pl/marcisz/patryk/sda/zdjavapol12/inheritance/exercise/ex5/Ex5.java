package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise.ex5;

class A
{
    String s = "Class A";
}

class B extends A
{
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class C extends B
{
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class Ex5
{
    public static void main(String[] args)
    {
        A c = new C();
        System.out.println(c.s);
    }
}
