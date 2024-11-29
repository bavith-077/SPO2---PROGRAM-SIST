//program to check palindrome using for loop:
import java.util.Scanner;
public class palindrome1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String input = sc.nextLine();
        String reversed = "";
        for(int i = input.length()-1;i>=0;i--){
            reversed += input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("the given string "+input+"is palindrome");
        }
        else{
            System.out.println("the given string "+input+"is not a plaindrome");
        }
    }
}
/*output:
enter the string :
madam
the given string madamis palindrome */