//program to read 2 string and check whether a contains b
import java.util.Scanner;
public class contains{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string a:");
        String a = sc.nextLine();
        System.out.println("enter the string b:");
        String b = sc.nextLine();
        if(a.contains(b)){
            System.out.println("yes the a contains b ");
        }
        else{
            System.out.println("no its not containing");
        }
    }
}
/*output:
enter the string a:
bavith mariyan
enter the string b:
mariyan
yes the a contains b*/