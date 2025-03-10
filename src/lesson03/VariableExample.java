package lesson03;

public class VariableExample {
    public static void main(String[] args) {

        changeArr();
    }
    public static void changeArr(){
        int [] [] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == i){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
