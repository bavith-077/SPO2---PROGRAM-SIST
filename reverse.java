//program to reverse a string 
import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String a = sc.nextLine();
        String revrsed = reverse(a);
        System.out.println("the reversed string is "+revrsed);
    }

public static String reverse(String str){
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
   }
}
/*output:
enter the string :
bavith
the reversed string is htivab*/
