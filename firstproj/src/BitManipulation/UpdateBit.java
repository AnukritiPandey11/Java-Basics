import java.util.*;

public class UpdateBit {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n1= sc.nextInt();//0101
        System.out.println("enter the position");
        int pos= sc.nextInt();
        System.out.println("1. for 0 \n2. for 1");
        int n= sc.nextInt();
        int bitMask= 1<<pos;
        if(n==1)
        {
            int newNum= ~(bitMask) & n1;
            System.out.println(newNum);
        }
        else if(n==2)
        {
            int newNum=bitMask | n1;
            System.out.println(newNum);
        }
        else{
            System.out.println("wrong choice");
        }
        sc.close();
    }
}
