class Base{
    String name;
    int cFees;
    public Base()
    {
        name="DSA";
        cFees=25000;
    }
    public Base(String n, int fees)
    {
        name=n;
        cFees=fees;
    }
    public void showdata()
    {
        System.out.println(name);
        System.out.println(cFees);
    }
}
public class Inheritance extends Base{
    public Inheritance(String name1, int fee)
    {
        super();
        
    }
    public void showdata()
    {
        super.showdata();

    }
    public static void main(String[] agr){
        Inheritance i=new Inheritance("Anukriti", 23000);
        i.showdata();
    }
    
    
}
