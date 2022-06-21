import java.util.Arrays;
import java.util.Random;

public class Z_2 {
    public static void main (String[] args) {
        Random rand = new Random();
        int size = 25;
        int[] array = new int[size];
        int min = 0;
        int max = 0;
        int temp;

        for ( int i = 0; i < size; i++ ) {
            array[i] = rand.nextInt(100);
            if ( array[min] > array[i] ) min = i;
            if ( array[max] < array[i] ) max = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min: "+"array["+min+"]="+array[min]);
        System.out.println("Max: "+"array["+max+"]="+array[max]);

        temp = array[min];
        array[min] = array[max];
        array[max] = temp;

        System.out.println(Arrays.toString(array));
    }
}
