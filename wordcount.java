//program to count number of words in para or a string 
import java.util.Scanner;
public class wordcount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String input = sc.nextLine();
        String[] words = input.trim().split("\\s");
        System.out.println("the number of words in a para:"+words.length);
    }
}
/*output:
enter the string:
hey macha epdi irruka 
the number of words in a para:4*/