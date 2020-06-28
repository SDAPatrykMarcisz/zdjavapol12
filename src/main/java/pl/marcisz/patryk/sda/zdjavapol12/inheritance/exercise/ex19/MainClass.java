package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise.ex19;

class X
{
    protected int m = 48;
}

class Y extends X
{
    void methodOfY()
    {
        m++;
        System.out.println(m);
    }
}

public class MainClass{
    public static void main(String[] args) {
        new Y().methodOfY();
    }
}