//program to find largest element in a array;
import java.util.Scanner;

public class Largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Largest element in the array is: " + max);
    }
}
/*output:
largest element in array is :102 */
