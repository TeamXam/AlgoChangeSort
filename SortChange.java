import java.util.Arrays;
import java.util.Random;

public class SortChange {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = new int[100000];
        Random rnd = new Random();
        for (int r = 0; r < array.length; r++){
            array[r] = rnd.nextInt(999);


            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int imin = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        imin = j;
                    }
                }
                if (i != imin) {
                    int temp = array[i];
                    array[i] = array[imin];
                    array[imin] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(array));
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
}
