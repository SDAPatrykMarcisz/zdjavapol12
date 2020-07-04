package pl.marcisz.patryk.sda.zdjavapol12.homework.enums.ex3;

public enum Print {

    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE;

    public void times(String s){
        for(int i=0; i<ordinal() + 1; i++){
            System.out.println(s);
        }
    }
}
