import java.util.*;

class result
{
    public static void main(String args[])
    {
        int a,st,e,sp,ba,total;
        float p;
        Scanner s=new Scanner(System.in);

        System.out.println("ENTER YOUR MARKS OUT OF 50:");
        
        System.out.print("ACCOUNT :");
        a=s.nextInt();

        System.out.print("STATISTICS :");
        st=s.nextInt();

        System.out.print("ENGLISH :");
        e=s.nextInt();

        System.out.print("SP :");
        sp=s.nextInt();

        System.out.print("BA :");
        ba=s.nextInt();

        total=a+st+e+sp+ba;
        System.out.println("TOTAL MARKS : "+total);

        p=total*100/250;
        System.out.println("TOTAL PERSONTAGE IS " +p+ " % ");

        if(p<=100 && p>80)
        {
          System.out.println("CONGRATULATIONS...YOU HAVE PASSED WITH THE DISTINCTION ");
        }
        else if(p<=80 && p>70)
           {
             System.out.println("CONGRATULATIONS...YOU HAVE PASSED WITH THE FIRST CLASS ");
            
           }
            else if(p<=70 && p>60)
                {
                 System.out.println("YOU HAVE PASSED WITH THE SECOND CLASS ");
                }
                else if(p<=60 && p>50)
                    {
                        System.out.println("YOU HAVE PASSED WITH THE THIRD CLASS ");
                    }
                    else if(p<=50 && p>33)
                        {
                           System.out.println("YOU HAVE PASSED WITH THE FOURTH CLASS ");
                        }
                        else
                        {
                            System.out.println("YOU HAVE FAILED ");
                        }
    }
}