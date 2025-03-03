package lesson02;

import java.sql.SQLOutput;

public class DataType {
    public static void main(String[] args) {
        int num = sum(2, 6);
        String bhos = "meqsedeuygundur";
        System.out.println(num + bhos);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
