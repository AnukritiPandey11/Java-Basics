import java.util.*;
public class Pattern {
    public static void main(String[] arg){
        //Scanner sc= new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int i=0;
        int j=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
                //System.out.print(" ");  
            }
            for(j=2;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }  
        for(i=1;i<=n;i++)
        {
            for(j=2;j<=i;j++)
                System.out.print(" ");
            for(j=1;j<=n-i;j++)
            {
                System.out.print("*");
                //System.out.print(" ");  
            }
            for(j=1;j<=n-i+1;j++)
                System.out.print("*");
            System.out.println();
        }    
    }
}


           