// write a program to print a fibonacci series :
public class fibonacci{
    public static void main(String args[]){
        int n =10;
        int t1 = 0;
        int t2=1;
        for(int i =1;i<=n;i++){
            System.out.println(t1+"");
            int sum = t1+t2;
            t1=t2;
            t2=sum;
        }
        
    }
}
/*output:
0
1
1
2
3
5
8
13
21
34 */