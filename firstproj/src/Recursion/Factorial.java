public class Factorial {
    public static void fact(int i,int n, int fac)
    {
        if(i==n){
            fac=fac*i;
            System.out.println(fac);
            return ;
        }
        fac=fac*i;
        i+=1;
        fact(i,n,fac);
    }
    //Alternate
    public static int calFact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact = calFact(n-1);
        int fact_n= n*fact;
        return fact_n;

    }
    public static void main(String[] arg)
    {
        int n = 4;
        fact(1,4,1);
        int facto=calFact(n);
        System.out.println(facto);
    }
}
