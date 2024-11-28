//program to iterate the charcter over the string 
import java.util.Scanner;
public class iteratechar{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the string");
         String input = sc.nextLine();
         for(int i = 0;i<=input.length();i++){
            char seperated = input.charAt(i);
            System.out.println("the iterated character over the string is :"+seperated);
         }         
    }
}
/*output:
enter the string
bavith mariyan
the iterated character over the string is :b
the iterated character over the string is :a
the iterated character over the string is :v
the iterated character over the string is :i
the iterated character over the string is :t
the iterated character over the string is :h
the iterated character over the string is :
the iterated character over the string is :m
the iterated character over the string is :a
the iterated character over the string is :r
the iterated character over the string is :i
the iterated character over the string is :y
the iterated character over the string is :a
the iterated character over the string is :n
*/