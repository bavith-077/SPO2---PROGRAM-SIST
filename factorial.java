//factorial program by using for loop:
import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        long factoriall = 1;
        for(int i=1;i<=num;i++){
            factoriall *=i;
        }
        System.out.println("the factorial of "+num+"is "+factoriall);
    }
}
/*output:
enter the number:
5
the factorial of 5is 120 */