class Details{
    String name;
    int age;
    int phone_num;
    public Details()
    {
        name=" ";
        age=0;
        phone_num=000;
    }
    public Details(String name1, int a, int phoneNum)
    {
        age=a;
        name=name1;
        phone_num=phoneNum;
    }
    public void showdata()
    {
        System.out.println("Details");
        System.out.println("Name  "+ name);
        System.out.println("Age "+ age);
        System.out.println("Phone Number "+ phone_num);
    }
}
class Student{
    public static void main(String[] arg){
        Details s1= new Details("Anukriti Pandey", 19, 914);
        Details s2= new Details();

        s1.showdata();
        s2.showdata();
    }

}
