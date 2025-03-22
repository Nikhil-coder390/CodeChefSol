import java.util.*;
import java.lang.*;
import java.io.*;

class minimumPizzas
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int testCases = read.nextInt();
        for(int i=0;i<testCases;i++){
            int n = read.nextInt();
            int x = read.nextInt();
            int res = (int)Math.ceil((double)(x*n)/4);
            System.out.println(res);
        }
        read.close();
    }
}
