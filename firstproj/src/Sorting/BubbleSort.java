import java.util.*;
public class BubbleSort {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element");
            int x=sc.nextInt();
            arr[i]=x;                                        
        }
        //Bubble sort
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++){   // Skip the already sorted elements in each pass
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
                
                 


        }
        System.out.println("Sorted Array");
        for(int i=0; i<n;i++)
        {
            
            System.out.println(arr[i]);
        }
        sc.close();

    }
    
}
    


