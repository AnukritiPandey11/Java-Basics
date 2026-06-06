import java.util.*;
public class Functions{

    public static int oddSum(int n){
        int sum=0;
        for(int i=1; i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum = oddSum(n);
        System.out.print("the sum of odd numbers from 1 to n is \t");
        System.out.println(sum);


    }
}
