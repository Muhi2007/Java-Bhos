package lesson02;

class Person {
    int name;
}

public class DataType {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = 12;
        changeInt(p);

        System.out.printf(p.name + "\n");
    }
    static void changeInt(Person obj){
        obj = new Person();
        obj.name += 1;
    }
}

