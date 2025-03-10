package lesson02;

class Person {
    String age;
}

public class DataType {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = "12";

        changeInt(p);

        System.out.print(p.age);
    }
    static void changeInt(Person obj){
        obj = new Person();
        obj.age += "2";
    }
}