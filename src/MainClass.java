public class MainClass
{
    public static void main(String args[])
    {
       System.out.println(squares(17,24));
        //System.out.println(2^4);
    }

    static int squares(int a, int b)
    {
        int start= (int) Math.sqrt(a);
        int num=0;
        int count=0;
        while(num<=b)
        {
            num= (int) Math.pow(start,2);
            if(num>=a&&num<=b)
            {
                count++;
            }
            start++;
        }
        return count;

    }
}
