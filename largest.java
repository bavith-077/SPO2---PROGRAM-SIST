//program to find largest element in a array;
public class largest{
    public static void main(String args[]){
        int[] arr ={1,5,7,60,70,102};
        int max = arr[0];
        for(int value : arr){
            if(value > max){
                max = value;
            }
            System.out.println("largest element in array is :"+max);
        }
    }
}
/*output:
largest element in array is :102 */