import java.util.*;
public class SetBit {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int pos=1;
        int bitMask=1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        sc.close();

    }


}
