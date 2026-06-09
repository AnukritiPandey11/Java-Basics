import java.util.*;
public class FirstClass {
    public static void main(String[] arg){
        //input
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        /*if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("greater");
        }
        else{
            System.out.println("smaller");
        }*/
       switch(a){
        case 1: 
             System.out.println("Hello");
                break;
        case 2:
            System.out.println("Namaste");
            break;
        case 3:
            System.out.println("Bonjour");
            break;
        default:
            System.out.println("invalid input"); 
       }
        sc.close();

    }
}