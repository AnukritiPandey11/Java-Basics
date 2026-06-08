import java.util.*;

public class SelectionSort
{
    public static void printArr(int[] array)
    {
        int n1= array.length;
        System.out.println("Sorted Array-:");
        for(int i=0;i<n1;i++)
        {
            System.out.println(array[i]+ " ");
        }
    }
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
        //selection sort
        for(int i=0;i<n;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        printArr(arr);
       
    }
}
//time complexity-: O(n^2)
