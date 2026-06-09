public class GetBit {
    public static void main(String[] arg){
        int n = 5;
        int pos =3;
        int bitMask=1<<pos-1;
        if((bitMask & n)==0)
            System.out.println("bit was zero");
        else{
            System.out.println("bit was 1");

        }
       

    }
}


