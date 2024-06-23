class m
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

class mol
{
    public static void main(String args[])
    {
        System.out.println(m.add(11,11));
         System.out.println(m.add(11,11,11));
    }
}