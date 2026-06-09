
import java.util.*;
public class Stringpermutation {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        int[] freq= new int[26];
        for(int i=0;i<s1.length(); i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            System.out.println(freq[i]);
        }
        sc.close();
    }
    
}
