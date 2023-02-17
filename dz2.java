import java.util.Arrays;

public class dz2 {
    public static void main(String[] args) {
        int[] array = { 5, 3, 7, 4, 9, 7, 4, 9 }; 
        int temp; 
        for (int i = array.length - 1; i > 0; i--) { 
            for (int j = 0; j < i; j++) { 
                if (array[j] > array[j + 1]) { 
                    temp = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
