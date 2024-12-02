//program to print integer in array type by getting input from the user 
import java.util.Scanner;
import java.util.Arrays;

public class intarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        String numberStr = Integer.toString(number);
        int[] digitsArray = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digitsArray[i] = numberStr.charAt(i) - '0'; 
            }
        System.out.print("Array of digits: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
            
        }
    }
}
/*output:
Enter an integer: 7654
7
Array of digits: 7 6 5 4*/