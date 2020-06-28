package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise.ex10;

public class XY {
    public static void main(String[] args) {
        Y y1 = new Y(2);
        Y y2 = new Y();
    }
}

class X
{
    public X(int i)
    {
        System.out.println(1);
    }
}

class Y extends X
{
    public Y(int i)
    {
        super(i);
        System.out.println(2);
    }

    public Y(){
        this(1);
    }

    public Y(int a, int b){
        this();
        this.a = a;
        this.b = b;
    }

    private int a;
    private int b;
}
