public class InsertionSort {
    public static void printArr(int[] array)
    {
        int n1= array.length;
        System.out.println("Sorted Array-:");
        for(int i=0;i<n1;i++)
        {
            System.out.println(array[i]+ " ");
        }
    }
    public static void main(String[] arg)
    {
        int[] arr={23,4,5,2,1,6};
        int n= arr.length;
        //insertion sort
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=curr; //because j=-1 heance we are doing j+1
        }
        printArr(arr);

    }

}
