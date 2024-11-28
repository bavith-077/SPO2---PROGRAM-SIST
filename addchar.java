//program to add a character in a string 
import java.util.Scanner;
public class addchar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the main string");
        String originalstring = sc.nextLine();
        System.out.println("enter the char to be inserted");
        char insertedchar = sc.next().charAt(0);
        System.out.println("enter the position to be inserted");
        int position = sc.nextInt();
        if(position<0||position>originalstring.length()){
            System.out.println("the position is invalid");
        }
        else{
            String modifiedstring = originalstring.substring(0,position)+insertedchar+originalstring.substring(position);
            System.out.println("the string after the char is inserted:"+modifiedstring);
        }

    }
}
/*output:
enter the main string
hello world!
enter the char to be inserted
J
enter the position to be inserted
6
the string after the char is inserted:hello Jworld!*/