package pl.marcisz.patryk.sda.zdjavapol12.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex7 {
    public static void main(String[] args) {
        Map<String, ArrayList<Person>> collect = Stream.of(
                new Person("Patryk", "Marcisz", 29, 175, ""),
                new Person("Patryk", "Drugi", 18, 180, ""),
                new Person("Jan", "Kulczyk", 80, 165, "")
        ).collect(Collectors.toMap(
                person -> person.getName(),
                person -> new ArrayList<>(Collections.singletonList(person)),
                (oldVal, newVal) -> {
                    ArrayList<Person> listToReturn = new ArrayList<>(oldVal);
                    listToReturn.addAll(newVal); //nie mozemy po prostu wykonac tego jako return, bo ta metoda zwraca boolean
                    return listToReturn;
                }
        ));

        System.out.println(collect);

        AbstractPerson person = new Person();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

abstract class AbstractPerson{

    private String comment2;

    abstract int getAge();

    public AbstractPerson(String comment2) {
        super();
        this.comment2 = comment2;
    }
}

interface A {
    default void fun999(){

    }
}

interface B {

}

interface C {
    default void fun999(){

    }
}

interface Workable extends A, B {
    public static final int D = 5;

    public abstract void fun();

    static void fun1(){
        //cos tu powinno byc
        //wywolanie
        //Workable.fun1();
    }

    default void fun2(){
        //cos tu powinno byc
        //przy wywolaniu:
        //Workable a = new Person();
        //a.fun2();
    }

//    @Override
//    default void fun999(){
//
//    }
}

class Person extends AbstractPerson implements Workable {
    protected String name;
    private String surName;
    private int age;
    private double height;
    private String comment;

    public Person(){
        this("Jan");
    }

    public Person(String name){
        this(name, "Matejko");
    }

    public Person(String name, String surName){
        this(name, surName, 18);
    }

    public Person(String name, String surname, int age){
        this(name, surname, age, 180.5);
    }

    public Person(String name, String surName, int age, double height){
        this(name, surName, age, height, "default comment");
    }

    public Person(String name, String surName, int age, double height, String comment) {
        super("comment2");
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.height = height;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getComment() {
        return comment;
    }

    void anyMethod(){

    }

    @Override
    public String toString() {
        return "[ " + name + " " + surName + " " + age + " " + height + " " + comment + " ]";
    }

    @Override
    public void fun() {

    }
}

class ConcretePerson extends Person{

    protected String name;

    public ConcretePerson(String name, String surName, int age, double height, String comment) {
        super(name, surName, age, height, comment);
    }

    @Override
    protected void anyMethod() {
        super.anyMethod();
        String superName = super.name;
    }
}


