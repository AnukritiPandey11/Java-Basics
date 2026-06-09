public class ques1 {
    //stack height n
    public static int print(int n, int x)
    {
        if(n==0)
        {
            return 1;
        }
        if (x==0)
        {
            return 0;
        }
        int xpownm1=print(n-1,x);
        int xpow=x* xpownm1;
        return xpow;
    }
    //stack height logn  
    public static int calpow(int x, int n){
        
        if(n==0)
        {
            return 1;
        }
        if (x==0)
        {
            return 0;
        }   
        //if n is even
        if(n%2==0)
        {
            return calpow(x,n/2)*calpow(x,n/2);
        }
        else
        {
            return calpow(x,n/2)*calpow(x,n/2) * x;
        }

    }
    public static void main(String[] arg)
    {
        int x=2;
        int n=3;
        int xpow=print(n,x);
        System.out.println(xpow);
        int pow=calpow(x,n);
        System.out.println(pow);
    }


}