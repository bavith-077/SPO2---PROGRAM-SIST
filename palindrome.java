//program to calculate whether two string is plaindrome or not 
import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = sc.nextLine();
        String lowersize = input.toLowerCase();
        String reversedstring = new StringBuilder(lowersize).reverse().toString();
        if(lowersize.equals(reversedstring)){
            System.out.println("the given string " +input+" is palindrome");
        }
        else{
            System.out.println("the give string "+input+"is palindrome");
        }
    }
}
/*output:
enter the string:
radar
the given string radar is palindrome*/