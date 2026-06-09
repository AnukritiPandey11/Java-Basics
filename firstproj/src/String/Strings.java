import java.util.*;
public class Strings {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        String nameRev= "";
        int n=name.length();
        for(int i=0;i<n;i++)
        {
            nameRev=nameRev+name.charAt(n-1-i);
        }
        System.out.println("original string-"+ name);
        System.out.println("reversed string- "+ nameRev);
        sc.close();
    }
}
