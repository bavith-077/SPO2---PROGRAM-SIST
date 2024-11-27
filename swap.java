//program to swap to string withoput the third variable 
import java.util.Scanner;
public class swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh 1st string:");
        String a = sc.nextLine();
        System.out.println("enter the 2nd string");
        String b = sc.nextLine();
        System.out.println("before swapping");
        System.out.println("string 1:"+a);
        System.out.println("string 2:"+b);

        a=a+b;
        b=a.replace(b,"");
        a=a.replace(b,"");

        System.out.println("after swapping");
        System.out.println("string 1:"+a);
        System.out.println("string 2:"+b);
    }
}
/*output:
enter teh 1st string:
bavith
enter the 2nd string
mariyan
before swapping
string 1:bavith
string 2:mariyan
after swapping
string 1:mariyan
string 2:bavith*/
