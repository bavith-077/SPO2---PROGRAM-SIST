//program to convert a string into array 
import java.util.Scanner;
    public class arraystring{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the string");
            String input = sc.nextLine();
            char[] toarray = input.toCharArray();
            for(char ch: toarray){
                System.out.println(ch);
            }
    }
}
/*output:
enter the string
bavith 
b
a
v
i
t
h */
