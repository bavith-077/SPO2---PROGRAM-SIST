//write a program to print a prime number :
import java.util.Scanner;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num<=10){
             isPrime = false;
             }
             else{
                for(int i =2;i<=num/2;i++){
                    if(num%i==0){
                       isPrime = false;
                       break;
            }
        }
        
             }
        if(isPrime){
            System.out.println(num+"the given number is prime");
        }
        else{
            System.out.println(num+"the given number is not prime");
        }
    }
}
/*output:
enter the number :
67
67the given number is prime*/