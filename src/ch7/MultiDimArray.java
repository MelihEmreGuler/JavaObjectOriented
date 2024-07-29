package ch7;

public class MultiDimArray {

    static void print(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("i:["+ i + "] j:["+ j+ "]");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        int[][] array1 = new int[5][3];

        print(array1);
    }
}
