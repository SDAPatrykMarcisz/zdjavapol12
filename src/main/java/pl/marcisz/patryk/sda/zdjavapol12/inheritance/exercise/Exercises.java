package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise;

import java.util.Objects;

public class Exercises {

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass());
        System.out.println(object.toString());
        System.out.println(object.equals(new Object()));
        System.out.println(object.hashCode());

        Object o2 = new String("Stringgg");
        System.out.println(o2.getClass());
        System.out.println(o2.toString());
        System.out.println(o2.equals(new Object()));
        System.out.println(o2.hashCode());

        Object nk = new NaszaKlasa("abc");
        Object nk2 = new NaszaKlasa("abc");
        System.out.println(nk.getClass());
        System.out.println(nk.toString());
        System.out.println(nk.equals(nk2));
        System.out.println(nk.hashCode());

        NaszaKlasa nk3 = new NaszaKlasa("1234");
        nk3.fun();
        Object o3 = nk3;
        //o3.fun();

    }

}

class NaszaKlasa extends Object{

    private String fieldS;

    public void fun(){

    }

    public NaszaKlasa(String fieldS) {
        this.fieldS = fieldS;
    }

//    @Override
//    public boolean equals(Object o){
//        if(o.getClass().getName().equals(NaszaKlasa.class.getName())){
//            NaszaKlasa comparingObject = (NaszaKlasa)o;
//            return fieldS.equals(comparingObject.fieldS);
//        }
//
//        if(o instanceof NaszaKlasa){
//            NaszaKlasa comparingObject = (NaszaKlasa)o;
//            return fieldS.equals(comparingObject.fieldS);
//        }
//
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NaszaKlasa that = (NaszaKlasa) o;
        return Objects.equals(fieldS, that.fieldS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldS);
    }

    @Override
    public String toString() {
        return "NaszaKlasa{" +
                "fieldS='" + fieldS + '\'' +
                '}';
    }
}


