import java.util.*;
import java.lang.*;
import java.io.*;

class credCoins
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0;i<t;i++){
            int x = read.nextInt();
            int y = read.nextInt();
            int res = (x*y)/100;
            System.out.println(res);
        }
        read.close();
    }
}
