//program to get charcter from the string 
import java.util.Scanner;
public class charposition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String input = sc.nextLine();
        System.out.println("enter the position of the charcter");
        int position = sc.nextInt();
        if(position<0||position>input.length()){
            System.out.println("the position is invalid");
        }
        else{
            char charposi = input.charAt(position);
            System.out.println("the char in the position "+position+ "is "+charposi);
        }
    }
}
/*output:
enter the string :
bavith mariyan
enter the position of the charcter
7
the char in the position 7is m */