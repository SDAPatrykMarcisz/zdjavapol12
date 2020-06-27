package pl.marcisz.patryk.sda.zdjavapol12.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println(exceptions());
    }

    public static String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }

}
