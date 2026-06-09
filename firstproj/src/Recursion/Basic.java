
public class Basic {
    //sum of first n natural number
    public static void sumNum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sumNum(i+1,n,sum);
    }
    public static void main(String[] arg)
    {
        //sum of natural number till n
        int n=1;
        sumNum(1,5,0);
    }
       
}
