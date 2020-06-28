package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise.ex6;

class A
{
    public A(){
        super();
    }

    static {
        System.out.println("THIRD");
    }
}

class B extends A
{
    public B(){
        super();
    }

    static {
        System.out.println("SECOND");
    }
}

class C extends B
{
    public C(){
        super();
    }

    static {
        System.out.println("FIRST");
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
        C c2 = new C();
    }
}