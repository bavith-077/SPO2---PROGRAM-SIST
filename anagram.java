//program to check whether the two strings are anagram 
import java.util.Scanner;
import java.util.Arrays;
public class anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("enter the second string:");
        String str2 = sc.nextLine();
        if(isAnagram(str1,str2)){
            System.out.println("the string is anagram");
        }
        else{
            System.out.println("the string is not anagram");
        }
    }

public static boolean isAnagram(String str1,String str2){
    str1 = str1.replaceAll(" ", "").toLowerCase();
    str2 = str2.replaceAll(" ", "").toLowerCase();
    if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        
        return new String(arr1).equals(new String(arr2));
    }
}
/*output:
enter the first string:
evil
enter the second string:
vile
the string is anagram*/