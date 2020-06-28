package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise.ex3;

class A
{
    public A(){
        super();
    }

    {
        System.out.println(1);
    }
}

class B extends A
{
    public B(){
        super();
    }

    {
        System.out.println(2);
    }
}

class C extends B
{
    public C(){
        super();
    }

    {
        System.out.println(3);
    }
}

public class Ex3
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
