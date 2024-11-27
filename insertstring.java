//program to insert one string into another string 
import java.util.Scanner;
public class insertstring{
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the main string");
        String mainstring = sc.nextLine();
        System.out.println("enter the inserting string");
        String insertingstring = sc.nextLine();
        System.out.println("enter the position that the string needs to be inserted ");
        int position = sc.nextInt();
        if(position<0||position>mainstring.length()){
            System.out.println("the position is invalid");
        }
        else{
            StringBuilder sb = new StringBuilder(mainstring);
            sb.insert(position,insertingstring);
            System.out.println("the string after inserting :"+sb.toString());
        }
        
    }
}
/*output:
enter the main string
hello world!
enter the inserting string
java
enter the position that the string needs to be inserted
6
the string after inserting :hello javaworld!*/
