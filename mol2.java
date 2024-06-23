class m
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
}

class mol2
{
    public static void main(String args[])
    {
        System.out.println(m.add(11,11));
        System.out.println(m.add(12.3,12.6));
    }
}