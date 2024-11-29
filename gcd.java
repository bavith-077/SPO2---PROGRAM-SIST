//program to find the greatest common divisor
import java.util.Scanner;
public class gcd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a1 = sc.nextInt();
        System.out.println("enter the second number :");
        int a2 = sc.nextInt();
        while(a1!=a2){
            if(a1>a2){
                a1 = a1-a2;
            }
            else{
                a2=a2-a1;
            }
            System.out.println(a1);
        }
    }
}
/*output:
enter the first number :
54
enter the second number :
24
30
6
6
6
6 */