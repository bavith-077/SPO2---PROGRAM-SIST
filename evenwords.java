//program to print even number of words in string
import java.util.Scanner;
public class evenwords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String words = sc.nextLine();
        String[] wordss = words.split(" ");
        for(String word: wordss){
            if(word.length()%2==0){
                System.out.println(word);
            }
        }
    }
}
/*output:
enter the String
bavith mariyan 
bavith*/