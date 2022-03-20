import java.util.Arrays;

public class java08DataTypeArray {
    public static void main(String[] args) {
        System.out.println("===Array Declare===");
        String[] arrayName;
        arrayName = new String[3];
        arrayName[0] = "salah";
        arrayName[1] = "mane";
        arrayName[2] = "firminho";
        System.out.println(Arrays.toString(arrayName));

        System.out.println("===Array Initialize===");
        int[] value1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(value1));

        System.out.println("array2Dimension");
        int[][] value2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(value2[0][0]);
        System.out.println(value2[0][1]);
        System.out.println(value2[0][2]);
    }
}
