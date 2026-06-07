import java.util.*;
public class ClearBit {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int pos=2;
        int bitMask=1<<pos;
        int newNumber= (~(bitMask)& n);
        System.out.println(newNumber);
    }
    
}


