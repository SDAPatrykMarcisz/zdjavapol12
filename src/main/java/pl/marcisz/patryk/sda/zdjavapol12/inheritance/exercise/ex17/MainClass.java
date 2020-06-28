package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise.ex17;

class M
{
    int i;

    public M(int i)
    {
        this.i = i--;
        this.i--;
    }
}

class N extends M
{
    public N(int i)
    {
        super(++i);
        System.out.println(i);
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
        System.out.println(n.i);
    }
}